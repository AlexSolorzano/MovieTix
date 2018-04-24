import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/profile")
public class Profile extends HttpServlet{
    public static String currentUser="";
    public static boolean loggedOut=false;
	Configuration cfg;
	HashMap map;
    Controller c = new Controller();
	public static void giveUser(String username)
    {
        currentUser=username;
    }

	public void init()
	{
		cfg = new Configuration(Configuration.VERSION_2_3_27);
		cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
		map =  new HashMap<>();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    loggedOut=false;
        
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        map.put("sub",false);
        map.put("msg2",false);
		try 
		{
            
            HttpSession session = request.getSession(); //Access the session
			String username= (String) session.getAttribute("user"); //get a attribute from the session
            
            
            //CHANGING USER INFO
            String new_address = request.getParameter("new_address");
            if(new_address != null)
            {
                System.out.println("PROFILE-this is address: "+new_address);
                c.changeAddress(username, new_address);
            }
            String new_password = request.getParameter("new_password");
            if(new_password !=null)
            {
                c.changePassword(username,new_password);
            }
            
            //LOGGING OUT
            String logout = request.getParameter("logout");
            if(logout != null && logout.equals("true"))
            {
                session.setAttribute("user"," ");
                session.invalidate();
                loggedOut=true;
                response.sendRedirect("/MovieTix/home");
            }

            String refundButton=request.getParameter("refundButton");
            if(refundButton!=null && refundButton.equals("true"))
            {
                String ticketID=request.getParameter("ticketID");
                int id = Integer.parseInt(ticketID);
                if(c.refundedTicket(id))
                {
                    map.put("msg2",true);
                }
            }
            
            //DISPLAYING USER INFO
            String name = c.getName(username);
            map.put("name",name);
            
            String address = c.getAddress(username);
            map.put("address",address);
            
            String email = c.getEmail(username);
            map.put("email",email);
            
            boolean showSubscribed = c.isSubsribed(username);
            if(showSubscribed)
            {
                map.put("sub",true);
            }

            ArrayList<Booking> list = c.getBookingList(username);
            map.put("bookings",list);

			Template template = cfg.getTemplate("profile.ftl");
			template.process(map,out);
            String s =request.getParameter("logout");
            
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}

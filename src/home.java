import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/home")
public class home extends HttpServlet{
	Configuration cfg;
	HashMap map;
	
	public void init()
	{
		cfg = new Configuration(Configuration.VERSION_2_3_27);
		cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
		map =  new HashMap<>();
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        map.put("vMsg",false);

		
		try 
		{
		    String username= request.getParameter("username");//add these to ftl 
		    String passwordSignIn = request.getParameter("password");// add these to ftl
		    
		    String email = request.getParameter("emailInput");
		    String firstName = request.getParameter("firstnameInput");
		    String lastName = request.getParameter("lastnameInput");
		    String password = request.getParameter("passwordInput");
    
		    if ( email != null)//SIGN UP SECTION
            {
                Controller c1 = new Controller();
                User u = new User(firstName, lastName, email, password);
                c1.createUser(u);
                Verification v=c1.createVerification(u);
                SendMail.sendVerification(email, v.getCode());
			    response.sendRedirect("/MovieTix/accountConfirmation");
			}
		    else if (username != null)//SIGN IN SECTION
			{
                Controller c1 = new Controller();
			    User u = new User(username, passwordSignIn);
                
                if(c1.logIn(u))
                    response.sendRedirect("/MovieTix/profile");
                else
                    map.put("vMsg",true);
                    
			}
		    
			map.put("person", "Marcus ");
			Template template = cfg.getTemplate("index.ftl");
			template.process(map,out);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        System.out.println("sup");
		doGet(request, response);
	}

}

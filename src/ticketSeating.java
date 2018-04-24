import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/ticketSeating")
public class ticketSeating extends HttpServlet{
	Configuration cfg;
	HashMap map;
	Controller c1 = new Controller();
	
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
		
		try 
		{
			HttpSession session = request.getSession(); //Access the session
			String title= (String) session.getAttribute("title"); //get a attribute from the session
			String showtime= (String) session.getAttribute("showtime"); //get a attribute from the session
			int showtimeID= Integer.parseInt(showtime);

			ArrayList<Seat> rowA = c1.getRow(showtimeID,1);
			map.put("rowA",rowA);
			ArrayList<Seat> rowB = c1.getRow(showtimeID,2);
			map.put("rowB",rowB);
			ArrayList<Seat> rowC = c1.getRow(showtimeID,3);
			map.put("rowC",rowC);
			ArrayList<Seat> rowD = c1.getRow(showtimeID,4);
			map.put("rowD",rowD);


			String pickSeatA = request.getParameter("pickSeatA");
			String pickSeatB = request.getParameter("pickSeatB");
			String pickSeatC = request.getParameter("pickSeatC");
			String pickSeatD = request.getParameter("pickSeatD");


			if(pickSeatA != null && !pickSeatA.equals(""))
			{
				System.out.println("pickSeatA: "+pickSeatA);
			String row =pickSeatA.substring(0,1);
			String col = pickSeatA.substring(2);
			c1.setSubTotal(0.0);
			session.setAttribute("row", row);//Store an attribute named user with value
			session.setAttribute("col", col);//Store an attribute named user with value
			response.sendRedirect("/MovieTix/purchase#movieListings");

			}else if(pickSeatB != null && !pickSeatB.equals(""))
			{
				String row =pickSeatB.substring(0,1);
				String col = pickSeatB.substring(2);
				c1.setSubTotal(0.0);
				session.setAttribute("row", row);//Store an attribute named user with value
				session.setAttribute("col", col);//Store an attribute named user with value
				response.sendRedirect("/MovieTix/purchase#movieListings");

			}
			else if(pickSeatC != null && !pickSeatC.equals(""))
			{
				String row =pickSeatC.substring(0,1);
				String col = pickSeatC.substring(2);
				c1.setSubTotal(0.0);
				session.setAttribute("row", row);//Store an attribute named user with value
				session.setAttribute("col", col);//Store an attribute named user with value
				response.sendRedirect("/MovieTix/purchase#movieListings");

			}
			else if(pickSeatD != null && !pickSeatD.equals("")) {
				String row = pickSeatD.substring(0, 1);
				String col = pickSeatD.substring(2);
				c1.setSubTotal(0.0);
				session.setAttribute("row", row);//Store an attribute named user with value
				session.setAttribute("col", col);//Store an attribute named user with value
				response.sendRedirect("/MovieTix/purchase#movieListings");

			}






			Template template = cfg.getTemplate("ticketSeating.ftl");
			template.process(map,out);
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

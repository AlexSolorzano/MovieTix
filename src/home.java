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
		
		try 
		{
		    String username= request.getParameter("username");//add these to ftl 
		    String passwordSignIn = request.getParameter("password");// add these to ftl
		    
		    String email = request.getParameter("emailInput");
		    String firstName = request.getParameter("firstnameInput");
		    String lastName = request.getParameter("lastnameInput");
		    String password = request.getParameter("passwordInput");
		    //Here I'm going to have an if statement to create a user and add to the database
		    if ( email != null)//SIGN UP SECTION
			{
                System.out.println("finesse");
			    response.sendRedirect("/MovieTix/accountConfirmation");
			}
		    else if (username != null)//SIGN IN SECTION
			{
			    response.sendRedirect("/MovieTix/profile");
			}
		    
			map.put("person", "Marcus ");
			//map.put(5, "hi");

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
		doGet(request, response);
	}

}

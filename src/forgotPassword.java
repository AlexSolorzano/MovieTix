import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/forgotPassword")
public class forgotPassword extends HttpServlet{
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
        Controller c = new Controller();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try 
        {
            String email = request.getParameter("email");
            map.put("vMsg",false);
            boolean resetPassword=true;
            
            if (email != null && !email.equals(""))
            {
                resetPassword=c.resetPassword(email);
            }  
           
            if(!resetPassword)
            {
                map.put("vMsg",true);
            }
            
            
			Template template = cfg.getTemplate("forgotPassword.ftl");
			template.process(map,out);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
       doGet(request,response); 
	}

}
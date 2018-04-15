import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/subscribed")
public class subscribed extends HttpServlet{
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
            
            boolean isUser=true;
            
            if (email != null && !email.equals(""))
            {
                isUser=c.duplicateEmail(email);
                if(!isUser)
                {
                    map.put("vMsg",true);
                }
                else
                {
                    c.subscribeUser(email);
                    SendMail.subscribedCon(email);
                }
            }  
           
            
            
            
			Template template = cfg.getTemplate("subscribed.ftl");
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
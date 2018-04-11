import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/accountConfirmation")
public class accountConfirmation extends HttpServlet{
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
       System.out.println("Inside the doPost");
        Controller c = new Controller();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try 
        {
		    String vcode = request.getParameter("vcode");
            String email = request.getParameter("email");
            map.put("vMsg",false);
            boolean verified=false;
            
            if (email != null && !email.equals("") && vcode != null &&!vcode.equals(""))
            {
                verified=c.checkVerification(vcode, email);
            }  
            else if(email != null && !email.equals(""))
            {
                System.out.println("Inside the right if ;/ ");
                c.resendVerification(email);
            }
           
            if(verified)
            {
                map.put("vMsg",true);
            }
            
            
			Template template = cfg.getTemplate("accountConfirmation.ftl");
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

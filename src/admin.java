import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/admin")
public class admin extends HttpServlet{
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
		  
            String title= request.getParameter("title");//add these to ftl 
		    String genre = request.getParameter("genre");// add these to ftl   
		    String cast = request.getParameter("cast");
		    String producer = request.getParameter("producer");
		    String director = request.getParameter("director");
		    String synopsis = request.getParameter("synopsis");
            String imagePath= request.getParameter("imagePath");//add these to ftl 
		    String trailerPath = request.getParameter("trailerPath");// add these to ftl
		    
		    String rating = request.getParameter("rating");
            int   nowPlaying = Integer.getInteger(request.getParameter("nowPlaying"));
		  
            Controller.createMovie(title, genre, cast, producer, director, synopsis, imagePath, trailerPath, rating, nowPlaying);
            

			Template template = cfg.getTemplate("admin.ftl");
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

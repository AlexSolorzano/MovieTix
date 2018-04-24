import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/moviePage")
public class moviePage extends HttpServlet{
	Configuration cfg;
	HashMap map;
	String mtitle="";
	Controller c = new Controller();
	
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
			HttpSession session = request.getSession();
			mtitle= (String) session.getAttribute("title");

			Movie m=c.getMovieInfo(mtitle);
			map.put("title",mtitle);
			map.put("genre",m.getGenre());
			map.put("cast",m.getCast());
			map.put("producers",m.getProducers());
			map.put("directors",m.getDirectors());
			map.put("synopsis",m.getSynopsis());
			map.put("imagePath",m.getImagePath());
			map.put("trailerPath",m.getTrailerPath());
			map.put("rating",m.getRating());
			map.put("nowPlaying",m.getNowPlaying());



			String buyMovie=request.getParameter("buyMovie");
			if(buyMovie !=null && buyMovie.equals("true"))
			{
				String user=(String)session.getAttribute("user");
				if(user!=null && !user.equals(""))
				{
					response.sendRedirect("/MovieTix/showtimes");
				}
				else
				{
					response.sendRedirect("/MovieTix/home#signIn");
				}
			}
			Template template = cfg.getTemplate("moviePage.ftl");
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

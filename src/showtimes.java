import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;
import java.sql.*;

@WebServlet("/showtimes")
public class showtimes extends HttpServlet{
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
            System.out.println("this is movieTitle= "+title);

            ArrayList<Showtime_obj> showtimes = c1.showtimeList(title);
            map.put("showtimes",showtimes);

            String selectShowtime=request.getParameter("selectShowtime");
            if(selectShowtime!=null && !selectShowtime.equals(""))
            {
                int end = selectShowtime.indexOf('-');
                String movieTitle=selectShowtime.substring(0,end);
                selectShowtime=selectShowtime.substring(end+1);
                end = selectShowtime.indexOf('-');

                String t = selectShowtime.substring(0,end);
                int theater= Integer.parseInt(t);
                selectShowtime=selectShowtime.substring(end+1);
                end = selectShowtime.indexOf('-');

                String month = selectShowtime.substring(0,end);
                selectShowtime=selectShowtime.substring(end+1);
                end = selectShowtime.indexOf('-');

                String day = selectShowtime.substring(0,end);
                selectShowtime=selectShowtime.substring(end+1);
                end = selectShowtime.indexOf('-');

                String time = selectShowtime.substring(0,end);
                Showtime_obj s = new Showtime_obj(movieTitle, theater, month, day, time);
                int ID =c1.getShowtimeID(s);
                String showtimeID=""+ID;
                session.setAttribute("showtime", showtimeID);
                response.sendRedirect("/MovieTix/ticketSeating");
            }


            Template template = cfg.getTemplate("showtime.ftl");
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

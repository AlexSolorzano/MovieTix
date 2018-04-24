import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import freemarker.template.*;

@WebServlet("/manager")
public class manager extends HttpServlet {
    Configuration cfg;
    HashMap map;

    public void init() {
        cfg = new Configuration(Configuration.VERSION_2_3_27);
        cfg.setServletContextForTemplateLoading(getServletContext(), "WEB-INF/templates");
        map = new HashMap<>();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        try {
            Controller c1 = new Controller();


            ArrayList<Booking> list = c1.getBookingList();
            map.put("tickets",list);

            Template template = cfg.getTemplate("manager.ftl");
            template.process(map, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
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
    String welcomeName = "";
	
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
        map.put("eMsg",false);
       // map.put("loggedIn",false);
		try 
		{
            Controller c1 = new Controller();

		    String username= request.getParameter("username");//add these to ftl 
		    String passwordSignIn = request.getParameter("password");// add these to ftl
		    
		    String email = request.getParameter("emailInput");
		    String firstName = request.getParameter("firstnameInput");
		    String lastName = request.getParameter("lastnameInput");
		    String password = request.getParameter("passwordInput");
            if(!c1.duplicateEmail(email))
            {
                if ( email != null)//SIGN UP SECTION
                {
                    User u = new User(firstName, lastName, email, password);
                    c1.createUser(u);
                    Verification v=c1.createVerification(u);
                    SendMail.sendVerification(email, v.getCode());
                    response.sendRedirect("/MovieTix/accountConfirmation");                }
                else if (username != null)//SIGN IN SECTION
                {
                    User u = new User(username, passwordSignIn);
                    if(c1.logIn(u))
                    {
						HttpSession session = request.getSession(); //Access the session

						int aLevel=c1.getAuthorization(u.getUserID());
                    	if(aLevel==0)
                    	{
							welcomeName=u.getUserID();
							session.setAttribute("user", welcomeName);//Store an attribute named user with value

						}else if(aLevel==1)//They're a manager
							response.sendRedirect("/MovieTix/manager");
						else if(aLevel==2)//They're admin
							response.sendRedirect("/MovieTix/admin");
						else//regular user
							response.sendRedirect("/MovieTix/profile");

					}
                    else {
						map.put("vMsg", true);
					}

                }
            }
            else {

				map.put("eMsg", true);
			}

            if(Profile.loggedOut)
			{
				welcomeName="";
				map.put("loggedIn",false);
			}
            map.put("user",welcomeName);






            //MOVIE SECTION
			ArrayList<Movie> movieList = c1.movieList();
			map.put("movies",movieList);

			HttpSession session = request.getSession();
			String mtitle = request.getParameter("goToMovie");
			if (mtitle!=null && !mtitle.equals(""))
			{
				session.setAttribute("title", mtitle);
				response.sendRedirect("/MovieTix/moviePage");
			}




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

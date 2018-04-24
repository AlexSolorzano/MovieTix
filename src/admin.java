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
		Controller c1 = new Controller();
		int stupid =0;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		map.put("noMovie",false);
		map.put("noUser",false);
		boolean movieExist=false;


		try
		{

			//SHOWTIME
			//add & delete show times
			String addShowtime = request.getParameter("addShowtime");
			String deleteShowtime = request.getParameter("deleteShowtime");

			if(addShowtime!=null && addShowtime.equals("true"))
			{
				System.out.println("sup");
				String title = request.getParameter("title");
				String t = request.getParameter("theater");
				String month = request.getParameter("month");
				String day = request.getParameter("day");
				String time = request.getParameter("time");

				int theater=Character.getNumericValue(t.charAt(0));
				Showtime_obj s = new Showtime_obj(title,theater,month,day,time);

				//check if movie exist
				if(!c1.addShowtime(s))
				{
					map.put("noMovie",true);
				}

				//gets ID to put into seating
				int showTimeID = c1.getShowtimeID(s);
				System.out.println("above create seating");
				c1.createSeating(showTimeID);
			}
			else if(deleteShowtime !=null && deleteShowtime.equals("true"))
			{
				String title = request.getParameter("title");
				String t = request.getParameter("theater");
				String month = request.getParameter("month");
				String day = request.getParameter("day");
				String time = request.getParameter("time");

				int theater=Character.getNumericValue(t.charAt(0));
				Showtime_obj s = new Showtime_obj(title,theater,month,day,time);


				if(!c1.deleteShowtime(s))
					map.put("noMovie",true);

			}
			else
				stupid++;


			//USERS
			//table
			ArrayList<User> users =c1.usersList();
			map.put("users",users);

			//disable user
			String disable = request.getParameter("disable");
			String enable = request.getParameter("enable");

			if(disable !=null && disable.equals("true"))
			{
				String email = request.getParameter("email");
				if(!c1.suspendUser(email,"false")) {
					map.put("noUser", true);
				}
				response.sendRedirect("/MovieTix/admin#movieListing");
			}
			else if(enable !=null && enable.equals("true"))
			{
				String email = request.getParameter("email");
				if(!c1.suspendUser(email,"true"))
					map.put("noUser",true);
				response.sendRedirect("/MovieTix/admin#movieListing");
			}
			else
				stupid++;


			//change Authentication
			String addAuth=request.getParameter("addAuth");
			if(addAuth !=null && addAuth.equals("true"))
			{
				String email = request.getParameter("email");
				String authorization=request.getParameter("authorization");
				int level = Integer.parseInt(authorization);
				if(!c1.updateAuth(email,level)) {
					map.put("noUser", true);
					System.out.println("no user");

				}
				response.sendRedirect("/MovieTix/admin#movieListing");
			}

			//remove user
			String deleteUser=request.getParameter("deleteUser");
			if(deleteUser !=null && deleteUser.equals("true"))
			{
				String email = request.getParameter("email");
				if(!c1.deleteUser(email))
					map.put("noUser",true);
				response.sendRedirect("/MovieTix/admin#movieListing");
			}




			//MOVIES
			//table
			ArrayList<Movie> movies =c1.movieList();
			map.put("movies",movies);
			//add, delete, or edit movies
			String addMovie=request.getParameter("addMovie");
			String editMovie=request.getParameter("editMovie");
			String deleteMovie=request.getParameter("deleteMovie");

			if (addMovie!=null && addMovie.equals("true"))
			{
				String title = request.getParameter("title");//add these to ftl
				String genre = request.getParameter("genre");// add these to ftl
				String cast = request.getParameter("cast");
				String producer = request.getParameter("producer");
				String director = request.getParameter("director");
				String synopsis = request.getParameter("synopsis");
				String imagePath = request.getParameter("imagePath");//add these to ftl
				String trailerPath = request.getParameter("trailerPath");// add these to ftl
				String rating = request.getParameter("rating");
				String nowPlaying = request.getParameter("nowPlaying");

				Movie m  = new Movie(title, genre, cast, producer, director, synopsis, imagePath, trailerPath, rating, nowPlaying);
				c1.addMovie(m);
				response.sendRedirect("/MovieTix/admin#about");
			}
			else if(editMovie !=null && editMovie.equals("true"))
			{

				String column="";
				String title = request.getParameter("title");//add these to ftl
				String genre = request.getParameter("genre");// add these to ftl
				String cast = request.getParameter("cast");
				String producer = request.getParameter("producer");
				String director = request.getParameter("director");
				String synopsis = request.getParameter("synopsis");
				String imagePath = request.getParameter("imagePath");//add these to ftl
				String trailerPath = request.getParameter("trailerPath");// add these to ftl
				String rating = request.getParameter("rating");
				String nowPlaying = request.getParameter("nowPlaying");
				System.out.println("if: "+producer);

				if(genre!=null && !genre.equals(""))
				{
					column="genre";
					movieExist=c1.editMovie(title,column,genre);
				}
				else if(cast!=null && !cast.equals(""))
				{
					column="cast";
					movieExist=c1.editMovie(title, column,cast);
				}
				else if(producer!=null && !producer.equals(""))
				{
					System.out.println("elseIf: "+producer);

					column="producers";
					movieExist=c1.editMovie(title, column,producer);
				}
				else if(director!=null && !director.equals(""))
				{
					column="directors";
					movieExist=c1.editMovie(title, column, director);
				}
				else if(synopsis!=null && !synopsis.equals(""))
				{
					column="synopsis";
					movieExist=c1.editMovie(title, column, synopsis);
				}
				else if(imagePath!=null && !imagePath.equals(""))
				{
					column="imagePath";
					movieExist=c1.editMovie(title, column,imagePath);
				}
				else if(trailerPath!=null && !trailerPath.equals(""))
				{
					column="trailerPath";
					movieExist=c1.editMovie(title, column,trailerPath);
				}
				else if(rating!=null && !rating.equals(""))
				{
					column="rating";
					movieExist=c1.editMovie(title, column,rating);
				}
				else if(nowPlaying!=null && !nowPlaying.equals(""))
				{
					column="nowPlaying";
					movieExist=c1.editMovie(title, column,nowPlaying);
				}
				else{
					column="";
				}
				if(!movieExist)
				{
					map.put("noMovie",true);
				}
				response.sendRedirect("/MovieTix/admin#about");
			}else if(deleteMovie !=null && deleteMovie.equals("true"))
			{
				String title = request.getParameter("title");
				movieExist=c1.deleteMovie(title);
				if(!movieExist)
				{
					map.put("noMovie",true);
				}
				response.sendRedirect("/MovieTix/admin#about");
			}


			//MANAGE TICKETS
			//pricing
			String updatePrice=request.getParameter("updatePrice");
			if(updatePrice!=null && updatePrice.equals("true"))
			{
				String adultTicket=request.getParameter("adultTicket");
				String childTicket=request.getParameter("childTicket");
				String bookingFee=request.getParameter("bookingFee");

				if(adultTicket!= null && !adultTicket.equals(""))
				{
					System.out.println("in ticket");
					int newprice=Integer.parseInt(adultTicket);
					String column= "adult";
					c1.updatePricing(column,newprice);
				}
				else if (childTicket!=null && !childTicket.equals(""))
				{
					int newprice=Integer.parseInt(childTicket);
					String column= "child";
					c1.updatePricing(column,newprice);
				}
				else if (bookingFee!=null && !bookingFee.equals(""))
				{
					int newprice=Integer.parseInt(bookingFee);
					String column= "bookingFee";
					c1.updatePricing(column,newprice);
				}
				else
					stupid++;
				response.sendRedirect("/MovieTix/admin#upcomingMovies");

			}

			int childTicket=c1.getPrice("child");
			int adultTicket=c1.getPrice("adult");
			int bookingFee=c1.getPrice("bookingFee");
			map.put("adultTicket",adultTicket);
			map.put("childTicket",childTicket);
			map.put("bookingFee",bookingFee);



			//promotions
			String addPromo = request.getParameter("addPromo");
			if(addPromo!=null && !addPromo.equals(""))
			{
				String discount= request.getParameter("discount");
				String expiration=request.getParameter("expiration");
				int percentage = Integer.parseInt(discount);
				Promotion p = new Promotion(expiration,percentage);
				c1.addPromotion(p);
				ArrayList<User> list = c1.usersList();
				for (int i=0; i<list.size();i++)
				{
					User u = list.get(i);
					if(u.getSubscribed().equals("true"))
					{
						SendMail.sendPromo(u.getEmail(), p);

					}
				}
				response.sendRedirect("/MovieTix/admin#upcomingMovies");

			}



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

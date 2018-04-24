import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.util.Date;

public class jdbcConnector 
{

    Connection con = null;
    Statement stmt = null;
    
    jdbcConnector()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/MovieTix_DB?    autoReconnect=true&useSSL=false", 
                                        "user", "user");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    //USER: SIGN UP
    public void addVerification(Verification v, User u)
        //creates verification  code pertaining to user
    {
        
        String  query = "INSERT INTO verification values(?, ?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, u.getUserID());
        ps.setString(2, v.getCode());
        ps.setString(3, v.getIsVerified());
        ps.setString(4, u.getEmail());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addUser(User u)
    {
        String  query = "INSERT INTO USERS values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, u.getUserID());
        ps.setString(2, u.getFirstname());
        ps.setString(3, u.getLastname());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getPassword());
        ps.setString(6, u.getAddress());
        ps.setString(7, u.getSubscribed());
        ps.setInt(8, u.getAuthorization());
        ps.setString(9, u.getSuspended());
        ps.execute();
          
      }
    catch (Exception e)
        {
            e.printStackTrace();
        }                 
    }
     
    public boolean checkVerification(String code, String email)
    //checking if code pertains to user
    {
        String query = "SELECT * FROM verification WHERE email=? and code=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, code);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()!= false)
            {
                verified(email);
                return true;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return false;
    }
    
     public void verified(String email)
    //the user is changed to verified
    {
        String query = "UPDATE verification SET verified =? WHERE email =?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, "true");
            ps.setString(2, email);
            ps.execute();   
        
        }catch (Exception e)
        { 
            e.printStackTrace();
        }
    }
    public void resendVerification(String email)
    //Resends the verification code
    {
        String query = "SELECT code FROM verification WHERE email=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String code = rs.getString("code");
            SendMail.sendVerification(email, code);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    

    //USER: LOG-IN
    public boolean isVerified(String username)
    //got be verified in order to log in
    {
        String hasVerified="";
        String query = "SELECT * FROM verification where userID=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                hasVerified = rs.getString("verified");
            }
            return(hasVerified.equalsIgnoreCase("true"));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean checkUser(User u)
    //Did the user type in the right credentials to login
    {
        boolean canLogin=isVerified(u.getUserID());
        if(!canLogin)
            return false;
        String query = "SELECT * FROM users WHERE userID=? and password=?";
        PreparedStatement ps = null;
        try
        {  
            ps=con.prepareStatement(query);
            ps.setString(1, u.getUserID());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();  
            return (rs.next());
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        return false;
    }
  
    public boolean resetPassword(String email)
    {
        String query = "SELECT * FROM users WHERE email=?";
        PreparedStatement ps = null;
        try{
                ps = con.prepareStatement(query);
                ps.setString(1,email);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    String password=rs.getString("password");
                    SendMail.sendPassword(email,password);
                    return true;
                }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public boolean duplicateEmail(String email)
    {
        String query = "SELECT * FROM users WHERE email=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            return(rs.next());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    public String getName(String username)
    {
        String s="";
        String s2="";
        String name=" ";
        String query = "SELECT * FROM users WHERE userID=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                s=rs.getString("firstname");
                s2=rs.getString("lastname");
            }
           name=s+" "+s2;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return name;
    }
    
    public String getAddress(String username)
    {
        String address="";
        String query = "SELECT * FROM users WHERE userID=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                address=rs.getString("address");
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return address;
    }
    
    public String getEmail(String username)
    {
       String email="";
        String query = "SELECT * FROM users WHERE userID=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                email=rs.getString("email");
            }
            System.out.println(email);
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return email; 
    }
    
    public void subscribeUser(String email)
    {
        String query= "UPDATE users SET subscribed =? WHERE email =?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,"true");
            ps.setString(2,email);
            ps.execute();
        }catch(Exception e)
        {
            e.printStackTrace();           
        }
    }
    
     public void changeAddress(String username,String new_address)
     {
         String query="UPDATE users SET address=?  WHERE userID=?";
         PreparedStatement ps = null;
         try{
             ps=con.prepareStatement(query);
             ps.setString(1,new_address);
             ps.setString(2,username);
             ps.execute();
         }catch(Exception e)
         {
             e.printStackTrace();
         }
     }
    public void changePassword(String username,String new_password)
     {
        String query="UPDATE users SET password=? WHERE userID=?";
         PreparedStatement ps = null;
         try{
             ps=con.prepareStatement(query);
             ps.setString(1, new_password);
             ps.setString(2, username);
             ps.execute();
         }catch(Exception e)
         {
             e.printStackTrace();
         }
     }
    public boolean isSubscribed(String username)
    {
        String query="SELECT * FROM users WHERE userID=?";
        String subscribed="";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                subscribed = rs.getString("subscribed");
            }
            return(subscribed.equals("true"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;   
    }
    public int getAuthorization(String username)
    {
        String query = "SELECT * FROM users where userID=?";
        int a=-1;
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                a=rs.getInt("authorization");
            }
            return a;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }

    
    public void addMovie(Movie m) 
    {
        String  query = "INSERT INTO movies VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getTitle());
        ps.setString(2, m.getGenre());
        ps.setString(3, m.getCast());
        ps.setString(5, m.getProducers());
        ps.setString(4, m.getDirectors());
        ps.setString(6, m.getSynopsis());      
        ps.setString(7, m.getImagePath());
        ps.setString(8, m.getTrailerPath());
        ps.setString(9, m.getRating());
        ps.setString(10,m.getNowPlaying());
        ps.execute();
          
      }
    catch (Exception e)
        {
            e.printStackTrace();
        }
	}

	public boolean movieExist(String title)
    {
        String query ="SELECT * FROM movies WHERE movieTitle= ?";
        PreparedStatement ps =  null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,title);
            ResultSet rs = ps.executeQuery();
            return (rs.next());

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editMovie(String title, String column, String newInfo)
    {
        if(!movieExist(title))
        {
            return false;
        }
        System.out.println(newInfo);
        String query="UPDATE movies SET "+column+"="+"? WHERE movieTitle=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,newInfo);
            ps.setString(2, title);


            ps.execute();
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteMovie(String title)
    {
        if(!movieExist(title))
        {
            return false;
        }
        String  query = "DELETE FROM movies WHERE movieTitle=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, title);
            ps.execute();
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;

    }
    public ArrayList<Movie> movieList()
    {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        String query="SELECT * FROM movies";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String title=rs.getString("movieTitle");
                String genre= rs.getString("genre");
                String cast= rs.getString("cast");
                String producers= rs.getString("producers");
                String directors= rs.getString("directors");
                String synopsis=rs.getString("synopsis");
                String  imagePath=rs.getString("imagePath");
                String trailerPath = rs.getString("trailerPath");
                String rating=rs.getString("rating");
                String nowPlaying=rs.getString("nowPlaying");
                movies.add(new Movie( title,genre, cast,producers, directors,
                        synopsis, imagePath, trailerPath, rating, nowPlaying));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return movies;
    }

    public Movie getMovieInfo(String movieTitle)
    {
        Movie m= new Movie();

        String query="SELECT * FROM movies where movieTitle=?";
        PreparedStatement ps = null;
        try
        {
            ps = con.prepareStatement(query);
            ps.setString(1,movieTitle);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                String title=rs.getString("movieTitle");
                String genre= rs.getString("genre");
                String cast= rs.getString("cast");
                String producers= rs.getString("producers");
                String directors= rs.getString("directors");
                String synopsis=rs.getString("synopsis");
                String  imagePath=rs.getString("imagePath");
                String trailerPath = rs.getString("trailerPath");
                String rating=rs.getString("rating");
                String nowPlaying=rs.getString("nowPlaying");
                m=new Movie( title,genre, cast,producers, directors,
                        synopsis, imagePath, trailerPath, rating, nowPlaying);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }


        return m;
    }





    public boolean duplicateShowtime(Showtime_obj s)
    {
        String query = ("SELECT * FROM showtimes WHERE movieTitle=? and theater=? and month=? and day=? and time=?");
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,s.getMovieTitle());
            ps.setInt(2,s.getTheater());
            ps.setString(3, s.getMonth());
            ps.setString(4,s.getDay());
            ps.setString(5, s.getTime());
            ResultSet rs= ps.executeQuery();
            return(rs.next());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean addShowTime(Showtime_obj s)
    {
        if(!movieExist(s.getMovieTitle()))
            return false;
        if(duplicateShowtime(s))
            return false;


        String query = "INSERT INTO showtimes values(null,?,?,?,?,?)";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,s.getMovieTitle());
            ps.setInt(2,s.getTheater());
            ps.setString(3,s.getMonth());
            ps.setString(4,s.getDay());
            ps.setString(5,s.getTime());
            ps.execute();
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteShowtime(Showtime_obj s)
    {
        if(!movieExist(s.getMovieTitle()))
        {
            return false;
        }
        String query = "DELETE FROM showtimes WHERE movieTitle=? AND theater=? AND month=? and day=? and time=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,s.getMovieTitle());
            ps.setInt(2,s.getTheater());
            ps.setString(3,s.getMonth());
            ps.setString(4,s.getDay());
            ps.setString(5,s.getTime());
            ps.execute();
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }


    public ArrayList<Showtime_obj> showtimeList(String title)
    {
        ArrayList<Showtime_obj> showtimeList = new ArrayList<Showtime_obj>();
        String query = "SELECT * FROM showtimes where movieTitle=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,title);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String movieTitle= rs.getString("movieTitle");
                int theater = rs.getInt("theater");
                String month = rs.getString("month");
                String day = rs.getString("day");
                String time = rs.getString("time");
                showtimeList.add(new Showtime_obj(movieTitle, theater, month, day, time));

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return showtimeList;
    }

    public void updatePrice(String column, int newPrice)
    {
        String query = "UPDATE pricing set "+column+"=? WHERE id=1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1,newPrice);
            ps.execute();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public int getPrice(String column)
    {
       int price=0;
        String query = "select * FROM pricing";
        PreparedStatement ps= null;
        try{
            ps = con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            rs.next();
            price=rs.getInt(column);
            return price;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return price;
    }
    public double getSubTotal()
    {
        double price=0;
        String query = "select * FROM pricing";
        PreparedStatement ps= null;
        try{
            ps = con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            rs.next();
            price=rs.getDouble("subtotal");
            return price;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return price;
    }

    public void setSubTotal(double x)
    {
        String query = "UPDATE pricing SET subtotal=? WHERE id=1";
        PreparedStatement ps= null;
        try{
            ps = con.prepareStatement(query);
            ps.setDouble(1, x);
            ps.execute();

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



    public boolean suspendUser(String email, String suspended)
    {
        if(!duplicateEmail(email))
            return false;
        String query="UPDATE users SET suspended=? WHERE email=?";
        PreparedStatement ps = null;
        try{
            ps= con.prepareStatement(query);
            ps.setString(1,suspended);
            ps.setString(2,email);
            ps.execute();
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<User> usersList()
    {
        ArrayList<User> list= new ArrayList<>();

        String query = "SELECT * FROM users";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                String userID= rs.getString("userID");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String address = rs.getString("address");
                String subscribed = rs.getString("subscribed");
                int authorization = rs.getInt("authorization");
                String suspended = rs.getString("suspended");
                list.add(new User(userID,firstname,lastname,email,password,address,subscribed,authorization,suspended));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }


    public int getShowtimeID(Showtime_obj s)
    {
        int ID =-1;
        String query = "SELECT * FROM showtimes WHERE movieTitle=? AND month=? AND day=? AND time=?";
        PreparedStatement ps = null;
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,s.getMovieTitle());
            ps.setString(2,s.getMonth());
            ps.setString(3,s.getDay());
            ps.setString(4, s.getTime());
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                ID=rs.getInt("ID");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ID;
    }

    public void createSeating(int showtimeID)
    {
        System.out.println("in create seating");
        for (int row=1; row<=4; row++)
        {
            for (int col=1; col<=5; col++)
            {
                String query = "INSERT INTO seats VALUES("+showtimeID+",?,?,?)";
                PreparedStatement ps = null;
                try {
                    ps = con.prepareStatement(query);
                    ps.setInt(1, row);
                    ps.setInt(2, col);
                    ps.setString(3, "true");
                    ps.execute();
                    System.out.print("hi!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public ArrayList<Seat> getRow(int showtimeID, int row){
        ArrayList<Seat> list = new ArrayList<>();
        String query = "SELECT * FROM seats WHERE showtimeID=? AND row=?";
        PreparedStatement ps = null;
        try{
            ps= con.prepareStatement(query);
            ps.setInt(1,showtimeID);
            ps.setInt(2,row);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                String available=rs.getString("available");
                int r=rs.getInt("row");
                int c=rs.getInt("col");
                list.add(new Seat(r,c,available));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }




    public void addTicket(Ticket t)
    {
        String  query = "insert into tickets values(null, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1, t.getShowtimeID());
            ps.setInt(2, t.getRow());
            ps.setInt(3, t.getCol());
            ps.setDouble(4,t.getPrice());
            ps.execute();      
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public int getTicketID(Ticket t)
    {
        int id=0;
        String query = "SELECT * FROM tickets WHERE showtimeID=? AND row=? AND col=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1,t.getShowtimeID());
            ps.setInt(2,t.getRow());
            ps.setInt(3,t.getCol());
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                id=rs.getInt("ticketID");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return id;
    }

    public void addBooking(Booking b)
    {
     String  query = "INSERT INTO bookings VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, b.getUserID());
        ps.setInt(2, b.getTicketID());
        ps.setString(3, b.getTitle());
        ps.setInt(4, b.getRow());
        ps.setInt(5,b.getCol());
        ps.setString(6,b.getDate());
        ps.setString(7,b.getTime());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public void addPromotion(Promotion p)
    {
        String  query = "insert into promotions values(?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, p.getCode());
        ps.setString(2, p.getExpiration());
        ps.setInt(3, p.getPercentage());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



    public boolean checkCoupon(String code)
    {
        String query = "SELECT * FROM promotions WHERE code=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            return (rs.next());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Promotion getCoupon(String code)
    {
        String query = "SELECT * FROM promotions WHERE code=?";
        PreparedStatement ps = null;
        Promotion p = new Promotion();
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                p.setCode(rs.getString("code"));
                p.setExpiration(rs.getString("expiration"));
                p.setPercentage(rs.getInt("percentage"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }


    public boolean deleteUser(String email)
    {
        if(!duplicateEmail(email))
            return false;

        String  query = "DELETE FROM users WHERE email=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, email);
        ps.execute();
        return true;
      }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateAuth(String email, int level)
    {
        if(!duplicateEmail(email))
            return false;

        String query = "UPDATE users SET authorization=? WHERE email=?";
        PreparedStatement ps = null;
        try{
            System.out.println("In JDBC");
            ps = con.prepareStatement(query);
            ps.setInt(1,level);
            ps.setString(2,email);
            ps.execute();
            return true;
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            return false;
    }

    public void deleteBooking(int id)
    {
        String  query = "DELETE FROM bookings WHERE ticketID=?";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1,id);
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteTicket(int id)
    {
        String  query = "DELETE FROM tickets WHERE ticketID=?";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deletePromotion(Promotion p)
    {
        String  query = "DELETE FROM promotions WHERE code=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, p.getCode());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   public Showtime_obj getShowtimeValues(int showtimeID)
{
    Showtime_obj s = new Showtime_obj();
    String query = "SELECT * FROM showtimes where ID=?";
    PreparedStatement ps = null;
    try{
        ps = con.prepareStatement(query);
        ps.setInt(1,showtimeID);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            s.setMonth(rs.getString("month"));
            s.setDay(rs.getString("day"));
            s.setMovieTitle(rs.getString("movieTitle"));
            s.setTheater(rs.getInt("theater"));
            s.setTime(rs.getString("time"));
        }
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return s;
}
    public ArrayList<Booking> getBookingList(String username)
    {
        ArrayList<Booking> list = new ArrayList<>();
        String query = "SELECT * FROM bookings WHERE userID=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                int ticketID=rs.getInt("ticketID");
                String title=rs.getString("title");
                int row=rs.getInt("row");
                int col = rs.getInt("col");
                String date = rs.getString("date");
                String time = rs.getString("time");
                list.add(new Booking(ticketID, title, row, col, date, time));
                System.out.println("sup list");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Booking> getBookingList()
    {
        ArrayList<Booking> list = new ArrayList<>();
        String query = "SELECT * FROM bookings";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String userID= rs.getString("userID");
                int ticketID=rs.getInt("ticketID");
                String title=rs.getString("title");
                int row=rs.getInt("row");
                int col = rs.getInt("col");
                String date = rs.getString("date");
                String time = rs.getString("time");
                list.add(new Booking(userID, ticketID, title, row, col, date, time));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }


   public void createPaymentInfo(PaymentInfo p, String username)
   {
       String query = "INSERT INTO paymentInfo values(?,?,?,?,?)";
       PreparedStatement ps = null;
       try{
           ps = con.prepareStatement(query);
           ps.setString(1, username);
           ps.setString(2, p.getCardNumber());
           ps.setString(3, p.getExpiration());
           ps.setString(4, p.getCardCVC());
           ps.setString(5, p.getCoupon());
           ps.execute();
       }catch(Exception e)
       {
           e.printStackTrace();
       }
   }

   public boolean refundedTicket(int id)
   {
       String query = "SELECT * FROM bookings where ticketID=?";
       PreparedStatement ps = null;
       try {
           ps = con.prepareStatement(query);
           ps.setInt(1,id);
           ResultSet rs = ps.executeQuery();
           rs.next();
           String date = rs.getString("date");
           String time = rs.getString("time");
           String date_time=date+" "+time;
           Date ticketDate = new SimpleDateFormat("MM/dd/yyyy HH:mma").parse(date_time);
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
           LocalDate localDate = LocalDate.now();
           String date2 = dtf.format(localDate);
           Date currentDate = new SimpleDateFormat("MM/dd/yyyy HH:mma").parse(date2);
           if(currentDate.after(ticketDate))
           {
               return false;
           }
           else {
               deleteBooking(id);
               deleteTicket(id);
               return true;
           }

       }catch(Exception e)
       {
           e.printStackTrace();
       }
       return false;
   }

    public void updateSeats(int showtimeID,int row, int col)
    {
        String query = "UPDATE seats set available='false' WHERE showtimeID=? AND row=? AND col=?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setInt(1,showtimeID);
            ps.setInt(2,row);
            ps.setInt(3,col);
            ps.execute();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
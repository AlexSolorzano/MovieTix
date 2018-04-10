import java.sql.*;
import java.util.*;
import java.io.*;

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
    public void addMovie(Movie m) 
    {
        String  query = "insert into movies values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getTitle());
        ps.setString(2, m.getGenre());
        ps.setString(3, m.getCast());
        ps.setString(5, m.getProducer());
        ps.setString(4, m.getDirector());
        ps.setString(6, m.getSynopsis());      
        ps.setString(7, m.getImagePath());
        ps.setString(8, m.getTrailerPath());
        ps.setString(9, m.getRating());
        ps.setInt(10,m.getNowPlaying()); 
        ps.execute();
          
      }
    catch (Exception e)
        {
            e.printStackTrace();
        }
	}

    public void addUser(User u)
    {
        String  query = "insert into users values(?, ?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, u.getFirstName());
        ps.setString(2, u.getLastName());
        ps.setString(3, u.getEmail());
        ps.setString(4, u.getPassword());
        ps.execute();
          
      }
    catch (Exception e)
        {
            e.printStackTrace();
        }                 
    }

    //how do different data types work here
    public void addTicket(Ticket t)
    {
        String  query = "insert into ticket values(?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(query);
            ps.setString(1, t.getTicketID());
            ps.setString(2, t.getTitle());
            ps.setDate(3, t.getDate());
            ps.setTime(4, t.getTime());
            ps.setInt(5, t.getRow());
            ps.setInt(6, t.getCol());      
            ps.execute();      
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void addBooking(Booking b)
    {
     String  query = "insert into bookings values(?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1, b.getUserID());
        ps.setString(2, b.getTicketID());
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
        ps.setDate(2, p.getExpiration());
        ps.setInt(3, p.getPercentage());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addVerificatin(Verification v)
    {
        
        String  query = "insert into verifications values(?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1, v.getUserID());
        ps.setString(2, v.getCode());
        ps.setString(3, v.getHasVerified());//this is an enumeration?
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void deleteMovie(Movie m)
    {
        String  query = "DELETE FROM movies WHERE title=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getTitle());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }

    public void deleteUser(User u)
    {
        String  query = "DELETE FROM users WHERE userID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1, m.getUserID());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteBooking(Booking b)
    {
        String  query = "DELETE FROM bookings WHERE userID=(?) ticketID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setInt(1, b.getUserID());
        ps.setString(1, b.ticketID());

        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void deleteTicket(Ticket t)
    {
        String  query = "DELETE FROM tickets WHERE ticketID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, t.getTicketID());
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
    
    
    //Not sure what the parameters for these should be 
    public void updateMovie(Movie m)
    {
        String  query = "UPDATE FROM movies WHERE title=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getTitle());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
    //maybe where one party equals the section I want to update and the other equals the thing placed in the queue
    public void updateUser(User u)
    {
        String  query = "DELETE FROM users WHERE userID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getUserID());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void updateBooking(Booking u)
    {
        String  query = "DELETE FROM users WHERE userID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getUserID());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void updateTicket(Ticket t)
    {
        String  query = "DELETE FROM tickets WHERE ticketID=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getTicketID());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void updatePromotion(Promotion p)
    {
        String  query = "DELETE FROM promotions WHERE code=(?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, m.getCode());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    

}
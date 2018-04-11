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

    //USER: SIGN UP
    public void addVerification(Verification v, User u)
    {
        
        String  query = "insert into verification values(?, ?, ?)";
        PreparedStatement ps = null;
      try{
        ps = con.prepareStatement(query);
        ps.setString(1, v.getCode());
        ps.setString(2, v.getIsVerified());
        ps.setString(3, u.getEmail());
        ps.execute(); 
      }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void addUser(User u)
    {
        String  query = "insert into users values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
    {
        String query = "select * from verification where email=? and code=?";
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
    {
        String query = "UPDATE verification set verified =? where email =?";
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
    {
        String query = "SELECT code from verification where email=?";
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
    public boolean checkUser(User u)
    {
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
  
    
    
    
    
    
    
    
    public void addMovie(Movie m) 
    {
        String  query = "insert into movies values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
        ps.setInt(10,m.getNowPlaying()); 
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
            ps.setString(2, t.getMovieTitle());
            ps.setString(3, t.getShowDate());
            ps.setString(4, t.getShowTime());
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
        ps.setString(2, p.getExpiration());
        ps.setInt(3, p.getPercentage());
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
        ps.setString(1, u.getUserID());
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
        ps.setString(1, b.getTicketID());

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
    
    //But not sure of the parameters
    //maybe where one party equals the section I want to update and the other equals the thing placed in the queue
    public void updateMovie(Movie m){}
    public void updateUser(User u){}
    public void updateBooking(Booking b){}
    public void updateTicket(Ticket t){}
    public void updatePromotion(Promotion p){}
    

}
import java.util.*;
import java.sql.Time;
public class Controller{
    
    jdbcConnector c = new jdbcConnector();
    
    
    //USER
    public void createUser(User u)//adds user to database
    {
        c.addUser(u);
    }
    public Verification createVerification(User u)
    {
        Verification v = new Verification();
        v.setCode(v.generateCode());
        v.setIsVerified("false");
        c.addVerification(v,u);
        return v;
    }
    public void resendVerification(String email)
    {
        
        c.resendVerification(email);
    }
    
    
    public boolean logIn(User u)
    {
        return(c.checkUser(u));
        
    }
   
    public boolean checkVerification(String code, String email)
    {
        return(c.checkVerification(code,email));
    }
    
    
    
    
    
    public  void createMovie(String title, String genre, String cast, String producer, String director, String synopsis, String imagePath, String trailerPath, String rating, int nowPlaying)
    {
       Movie m = new Movie(title, genre, cast, producer, director, synopsis, imagePath, trailerPath, rating, nowPlaying);
    
        c.addMovie(m);    
        
    }
    public void createPromotion(String code, String expiration, int percentage)
    {
        Promotion p = new Promotion(code, expiration,percentage);
        c.addPromotion(p);
    }
    
    public void createBooking(int userID, String ticketID)
    {
        Booking b = new Booking(userID, ticketID);
        c.addBooking(b);
    }
    
    public void createTicket(int userID, String title, String showDate, String showTime, int row, int col)
    {
        Ticket t = new Ticket(userID, title, showDate, showTime, row, col);
        c.addTicket(t);
    }
    
    //do I have to transfer all of my connector classes in here?

}
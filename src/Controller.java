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
    
    public boolean resetPassword(String email)
    {
        return(c.resetPassword(email));
    }
    
    public boolean duplicateEmail(String email){
        return(c.duplicateEmail(email));
    }
    
    //PROFILE INFORMATION
    public String getName(String username)
        //display name
    {
        return(c.getName(username));
    }
    
    public String getEmail(String username)
        //display email
    {
        return(c.getEmail(username));
    }
    
    public String getAddress(String username)
        //display address
    {
        return(c.getAddress(username));
    }
    
    public boolean isSubsribed(String username)
    //tells you if user is subscribed
    {
        return(c.isSubscribed(username));
    }
    
    public void subscribeUser(String email)
    //subscribes the user
    {
        c.subscribeUser(email);
    }
    
    public void changeAddress(String username,String new_address)
    {
        System.out.println("CONTROLLER- this is address: "+new_address);
         c.changeAddress(username, new_address);
    }
   
    public void changePassword(String username,String new_password)
    {
         c.changePassword(username, new_password);
    }

    public int getAuthorization(String username){
       return(c.getAuthorization(username));
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
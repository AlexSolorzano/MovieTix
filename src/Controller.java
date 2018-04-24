import java.sql.Array;
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
         c.changeAddress(username, new_address);
    }
   
    public void changePassword(String username,String new_password)
    {
         c.changePassword(username, new_password);
    }

    public int getAuthorization(String username){
       return(c.getAuthorization(username));
    }

    public ArrayList<User> usersList()
    {
        return(c.usersList());
    }

    public boolean suspendUser(String email, String suspended)
    {
        return(c.suspendUser(email, suspended));
    }

    public boolean updateAuth(String email, int level)
    {
        return (c.updateAuth(email, level));
    }

    public boolean deleteUser(String email)
    {
        return(c.deleteUser(email));
    }




    public  void addMovie(Movie m)
    {
        c.addMovie(m);
    }


    public boolean editMovie(String title, String column, String newInfo)
    {
        return(c.editMovie(title, column, newInfo));
    }

    public boolean deleteMovie(String title)
    {
        return(c.deleteMovie(title));
    }

    public ArrayList<Movie> movieList()
    {
        return (c.movieList());
    }



    public Movie getMovieInfo(String title)
    {
        return(c.getMovieInfo(title));
    }



    public int getShowtimeID(Showtime_obj s)
    {
        return c.getShowtimeID(s);
    }



    public boolean addShowtime(Showtime_obj s)
    {
        return(c.addShowTime(s));
    }

    public boolean deleteShowtime(Showtime_obj s)
    {
        return(c.deleteShowtime(s));
    }



    public ArrayList<Showtime_obj> showtimeList(String title)
    {
        return(c.showtimeList(title));
    }


    public void updatePricing(String column, int newPrice)
    {
        c.updatePrice(column,newPrice);
    }

    public int getPrice(String column)
    {
        return(c.getPrice(column));
    }

    public double getSubTotal(){
        return (c.getSubTotal());
    }
    public void setSubTotal(Double x)
    {
        c.setSubTotal(x);
    }

    public ArrayList<Booking> getBookingList(String username)
    {
        return c.getBookingList(username);
    }
    public ArrayList<Booking> getBookingList()
    {
        return c.getBookingList();
    }
    public void addPromotion(Promotion p)
    {
        c.addPromotion(p);
    }

    public void createSeating(int showtimeID)
    {
        c.createSeating(showtimeID);
    }


    public boolean refundedTicket(int id)
    {
        return(c.refundedTicket(id));
    }


    public ArrayList<Seat> getRow(int showtimeID, int row){
        return (c.getRow(showtimeID,row));
    }


    public boolean checkCoupon(String code){
        return(c.checkCoupon(code));
    }
    public Promotion getCoupon(String code){
        return (c.getCoupon(code));
    }


    public void createBooking(String username, int ticketID, String title, int row, int col, String date,String time)
    {
        Booking b = new Booking(username,ticketID,title, row, col, date, time);
        c.addBooking(b);
    }
    
    public void createTicket(Ticket t)
    {
        c.addTicket(t);
    }
   public Showtime_obj getShowtimeValues(int showtimeID){
        return(c.getShowtimeValues(showtimeID));
   }

   public void createPaymentInfo(PaymentInfo p, String username)
   {
       c.createPaymentInfo(p, username);
   }


    public int getTicketID(Ticket t)
    {
        return(c.getTicketID(t));
    }
    public void updateSeats(int showtimeID, int row, int col)
    {
        c.updateSeats(showtimeID, row, col);
    }

}
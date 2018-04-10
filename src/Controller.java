public class Controller{
    
    jdbcConnector c = new jdbcConnector();
    
    public static void createMovie(String title, String genre, String cast, String producer, String director, String synopsis, String imagePath, String trailerPath, String rating, int nowPlaying)
    {
       Movie m = new Movie(title, genre, cast, producer, director, synopsis, imagePath, trailerPath, rating, nowPlaying);
    
        c.addMovie(m);    
        
    }
    
    public static void createUser(String firstname, String lastname, string email, string password)
    {
        User u = new User(firstname, lastname, email, string);
        c.addUser(u);
    }
   
    public static void createPromotion(String code, Date expiration, int percentage)
    {
        Promotion p = new Promotion(code, expiration,percentage);
        c.addPromotion(p);
    }
    
    public static void createBooking(int userID, Strin ticketID)
    {
        Booking b = new Booking(userID, ticketID);
        c.addBooking(b);
    }
    
    public static void createTicket(int userID, String title, Date showDate, Time showTime, int row, int col)
    {
        Ticket t = new Ticket(userID, title, showDate, showTime, row, col);
        c.addTicket(t);
    }
    
    public static void createVerification(int userID, String code, boolean hasVerified)
    {
        Verification v = new Verification(userID, code, hasVerfified);
        c.addVerification(v);
    }
    //do I have to transfer all of my connector classes in here?
    
}
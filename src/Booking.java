public class Booking {
  
  private int userID;
  private String ticketID;

  public Booking(int userID, String ticketID){
    this.userID = userID;
    this.ticketID = ticketID;
  }

  public int getUserID(){
   return userID; 
  }
  
  public void setUserID(int uID){
   this.userID = uID; 
  }
  
  public String getTicketID(){
   return ticketID; 
  }
  
  public void setTicketID(String tID){
    this.ticketID = tID;
  }

}

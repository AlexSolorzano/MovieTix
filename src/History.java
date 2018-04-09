public class History {
  
  private User user;
  private Ticket ticket;
  private int uID;
  private int tID;

  public History(User user, Ticket ticket){
    this.user = user;
    this.ticket = ticket;
    this.uID = user.getUserID();
    this.tID = ticket.getTicketID();
  }
  
  public History(int uID, int tID){
    this.uID = uID;
    this.tID = tID;
  }
  
  public History(){
    user = NULL;
    ticket = NULL;
    uID = 0;
    tID = 0;
  }

  public User getUser(){
   return user; 
  }
  
  public void setUser(User user){
    this.user = user; 
  }
  
  public Ticket getTicket(){
    return ticket; 
  }
  
  public void setTicket(Ticket ticket){
   this.ticket = ticket; 
  }
  
  public int getUserID(){
   return uID; 
  }
  
  public void setUserID(int uID){
   this.uID = uID; 
  }
  
  public int getTicketID(){
   return tID; 
  }
  
  public void setTicketID(int tID){
    this.tID = tID;
  }

}

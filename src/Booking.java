public class History {
  
  private Users user;
  private Ticket ticket;
  private int uID;
  private int tID;

  public History(Users user, Ticket ticket){
    this.user = user;
    this.ticket = ticket;
    this.uID = user.getID();
    this.tID = ticket.getID();
  }
  
  public History(int uID, int tID){
    this.uID = uID;
    this.tID = tID;
  }
  
  public History(){
    user = null;
    ticket = null;
    uID = 0;
    tID = 0;
  }

  public User getUser(){
   return user; 
  }
  
  public void setUser(Users user){
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

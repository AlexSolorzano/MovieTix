public class Booking {
  
  private String userID;
  private int ticketID;
  private String title;
  private int row;
  private int col;
  private String date;
  private String time;


  public Booking(){};
  public Booking(int ticketID, String title, int row, int col, String date, String time)
  {
      this.ticketID = ticketID;
      this.title=title;
      this.row=row;
      this.col=col;
      this.date=date;
      this.time=time;
  }

  public Booking(String userID, int ticketID, String title, int row, int col, String date, String time){
    this.userID = userID;
    this.ticketID = ticketID;
    this.title=title;
    this.row=row;
    this.col=col;
    this.date=date;
    this.time=time;
  }

  public int getCol() {
    return this.col;
  }

  public int getRow() {
    return this.row;
  }

  public String getDate() {
    return this.date;
  }

  public String getTime() {
    return this.time;
  }

  public String getTitle() {
    return this.title;
  }

  public void setCol(int col) {
    this.col = col;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public void setTicketID(int ticketID) {
    this.ticketID = ticketID;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public void setTitle(String title) {
    this.title=title;

  }

  public String getUserID(){
   return this.userID;
  }
  
  public void setUserID(String uID){
   this.userID = uID; 
  }
  
  public int getTicketID(){
   return this.ticketID;
  }
  
  public void setTickeID(int tID){
    this.ticketID = tID;
  }

}

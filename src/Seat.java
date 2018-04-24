
public class Seat {
  
  private int row;
  private int col;
  private String available;
  
  public Seat(int row, int col,String avail){
    this.row = row;
    this.col = col;
    this.available=avail;
  }
  public Seat(String avail)
  {
    this.available=avail;
  }
  
  public int getRow() {
    return this.row;
  }
  
  public void setRow(int row) {
    this.row = row;
  }
  
  public int getCol() {
    return this.col;
  }
  
  public void setCol(int col) {
    this.col = col;
  }

  public void setAvailable(String availability) {
    this.available = availability;
  }
  public String getAvailable() {
    return available;
  }
}

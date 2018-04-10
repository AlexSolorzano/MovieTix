package MovieTheaterObjects;

public class Seat {
  
  private int row;
  private int col;
  
  public Seat(int row, int col){
    this.row = row;
    this.col = col
  }
  
  public Seat() {
    Seat(0,0);
  }
  
  public int getRow() {
    return row;
  }
  
  public void setRow(int row) {
    this.row = row;
  }
  
  public int getCol() {
    return col;
  }
  
  public void setCol(int col) {
    this.col = col;
  }
  
}

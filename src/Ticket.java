/*
 * class: Tickets
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/2/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the Promotion objects of our project
 * 
 * TO-DO: 
 * Generate random confirmation numbers 
 * keep track of ticket numbers 
 * 
 */

import java.util.Date;
import java.sql.Time;

public class Ticket {
    private int ticketID;
    private int showtimeID;
    private int row;
    private int col;
    private double price;
    
    public Ticket(int showtimeID, int row, int col, double price)
    {
        this.ticketID=ticketID;
       this.showtimeID=showtimeID;
        this.row = row;
        this.col = col;
        this.price=price;
    }
    
    public int getTicketID() {
        return ticketID;   
    }
    
    public void setTicketID(int id) {
        this.ticketID = id;   
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public void setShowtimeID(int showtimeID) {
        this.showtimeID = showtimeID;
    }

    public int getRow() {
        return row;   
    }
    
    public void setRow(int row) {
        this.row = row; 
    }
    public int getCol(){
        return col;
    }
    public void setCol(int col){
        this.col=col;
    }
        
}

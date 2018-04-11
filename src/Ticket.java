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
    private String ticketID;
    private String movieTitle;
    private String showDate; 
    private String showTime;
    private int row;
    private int col;
    
    public Ticket(int userID, String movieTitle, String showDate, String showTime, int row, int col)
    {
        this.ticketID="t_"+userID+"m_"+movieTitle+"s_"+row+col;
        this.movieTitle = movieTitle;
        this.showDate = showDate;
        this.showTime = showTime;
        this.row = row;
        this.col = col;
    }
    
    public String getTicketID() {
        return ticketID;   
    }
    
    public void setTicketID(String id) {
        this.ticketID = id;   
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
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

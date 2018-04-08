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
package MovieTheaterObjects;

import java.util.Date;
import java.sql.Time;

public class Tickets {
    private int id;
    private String movieTitle;
    private Date showDate; 
    private Time showTime;
    private Seat seats;

    /*
     * Tickets()
     * -----------------------------
     * This is our tickets constructor. I made the primary construtor 
     * for tickets to only instantiate with the movie title with the 
     * idea that the customer would pick this as the first attribute 
     * in their selection process. This is up for debate
     */
    public Tickets(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Tickets(int id, String movieTitle, Date showDate, Time showTime, Seat seats) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.showDate = showDate;
        this.showTime = showTime;
        this.seats = seats;
    }
    
    public int getID() {
        return id;   
    }
    
    public void setID(int id) {
        this.id = id;   
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Time getShowTime() {
        return showTime;
    }

    public void setShowTime(Time showTime) {
        this.showTime = showTime;
    }
    
    public Seat getSeat() {
        return seats;   
    }
    
    public void setSeat(Seat seats) {
        this.seats = seats; 
    }
}

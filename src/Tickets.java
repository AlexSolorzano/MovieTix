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
    private String movieTitle;
    //private int confirmationNum;
    //private int seatNum;
    //private int ticketNum;
    private Date showDate; 
    private Time showTime;
    //private double price;
    //private boolean promotional;

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

    public Tickets(String movieTitle, int seatNum, Date showDate, Time showTime) {
        this.movieTitle = movieTitle;
        this.seatNum = seatNum;
        this.showDate = showDate;
        this.showTime = showTime;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getConfirmationNum() {
        return confirmationNum;
    }

    public void setConfirmationNum(int confirmationNum) {
        this.confirmationNum = confirmationNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPromotional() {
        return promotional;
    }

    public void setPromotional(boolean promotional) {
        this.promotional = promotional;
    }
}

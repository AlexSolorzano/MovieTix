/*
 * class: Movies
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/1/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the Movie objects of our project
 * 
 * TO-DO: 
 * 
 * 
 */
package users;

import java.util.Date;
import java.sql.Time;

enum Genres {
    // This is where our list of genres will go 
}

public class Movies {
    // need to find out how to add a JPEG for movie cover 
    // need to find out how to add a MP4 for a movie trailer 
    // do we need an attribute for review and rating?
    private String title;
    private String synopsis; 
    private String review; 
    private int playLength; // represented in minutes 
    private String[] cast;
    private String[] producers;
    private String[] directors;
    private Date[] showDates; 
    private Time[] showTimes;
    private String rating;
    private String imagePath;
    private String trailerPath;
    private Enum genre;
    private boolean nowPlaying;

    /*
     * Movies()
     * -----------------------------
     * this is our movies constructor for creating new movies
     */
    public Movies(String title, int playLength, Date[] showDates, Time[] showTimes, Enum genre, boolean nowPlaying) {
        this.title = title;
        this.playLength = playLength;
        this.showDates = showDates;
        this.showTimes = showTimes;
        this.genre = genre;
        this.nowPlaying = nowPlaying;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getPlayLength() {
        return playLength;
    }

    public void setPlayLength(int playLength) {
        this.playLength = playLength;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }

    public String[] getProducers() {
        return producers;
    }

    public void setProducers(String[] producers) {
        this.producers = producers;
    }

    public String[] getDirectors() {
        return directors;
    }

    public void setDirectors(String[] directors) {
        this.directors = directors;
    }

    public Date[] getShowDates() {
        return showDates;
    }

    public void setShowDates(Date[] showDates) {
        this.showDates = showDates;
    }

    public Time[] getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(Time[] showTimes) {
        this.showTimes = showTimes;
    }

    public Enum getGenre() {
        return genre;
    }

    public void setGenre(Enum genre) {
        this.genre = genre;
    }

    public boolean isNowPlaying() {
        return nowPlaying;
    }

    public void setNowPlaying(boolean nowPlaying) {
        this.nowPlaying = nowPlaying;
    }
    
    public String getRating() {
        return rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;   
    }
    
    public String getImagePath() {
        return imagePath;   
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public String getTrailerPath() {
        return trailerPath;   
    }
    
    public void setTrailerPath(String trailerPath) {
        this.trailerPath = trailerPath;   
    }
}

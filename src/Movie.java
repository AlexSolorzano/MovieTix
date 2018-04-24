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


import java.util.Date;
import java.sql.Time;

public class Movie {
    // need to find out how to add a JPEG for movie cover 
    // need to find out how to add a MP4 for a movie trailer 
    // do we need an attribute for review and rating?
    private String title;
    private String genre;
    private String cast;
    private String producers;
    private String directors;
    private String synopsis;
    private String imagePath;
    private String trailerPath;
    private String rating;
    private String nowPlaying;


   public Movie(){}


    /*
     * Movies()
     * -----------------------------
     * this is our movies constructor for creating new movies
     */
    public Movie(String title, String genre, String cast, String producers, String directors, String synopsis, String imagePath, String trailerPath, String rating, String nowPlaying) {
        this.title = title;
        this.genre = genre;
        this.cast = cast;
        this.producers = producers;
        this.directors = directors;
        this.synopsis = synopsis;
        this.imagePath = imagePath;
        this.trailerPath = trailerPath;
        this.rating = rating;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNowPlaying() {
        return nowPlaying;
    }

    public void setNowPlaying(String nowPlaying) {
        this.nowPlaying = nowPlaying;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getProducers() {
        return producers;
    }

    public void setProducers(String producers) {
        this.producers = producers;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

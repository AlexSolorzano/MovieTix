import java.util.Random;
public class Showtime_obj {

    private String month;
    private String day;
    private String time;
    private String movieTitle;
    private int theater;
    private int ID;

    public Showtime_obj(){};

    public Showtime_obj(String movieTitle, int theater, String  month, String day, String time)
    {
        this.ID=ID;
        this.month=month;
        this.day=day;
        this.time=time;
        this.movieTitle=movieTitle;
        this.theater=theater;
    }


    public String getMovieTitle()
    {
        return(this.movieTitle);
    }
    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle=movieTitle;
    }

    public int getTheater()
    {
        return(this.theater);
    }
    public void setTheater(int theater)
    {
        this.theater=theater;
    }

    public String getMonth()
    {
        return(this.month);
    }
    public void setMonth(String month)
    {
        this.month=month;
    }

    public String getDay()
    {
        return(this.day);
    }
    public void setDay(String day)
    {
        this.day=day;
    }

    public String getTime()
    {
        return(this.time);
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public int getID()
    {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}


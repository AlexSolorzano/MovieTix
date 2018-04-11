/*
 * class: Promotions
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/2/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the Promotion objects of our project
 * 
 * TO-DO: 
 * 
 * 
 */

import java.util.Date;

public class Promotion {
    private String code; 
    private String expiration;
    private int percentage;

    /*
     * Promotions()
     * -----------------------------
     * this is our Promotions constructor for creating new promotions
     */
    public Promotion(String code, String expiration, int percentage) {
        this.code = code;
        this.expiration = expiration;
        this.percentage = percentage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
   
}

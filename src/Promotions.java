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
package MovieTheaterObjects;

import java.util.Date;

public class Promotions {
    private String code; 
    private Date expiration;
    private double percentage;

    /*
     * Promotions()
     * -----------------------------
     * this is our Promotions constructor for creating new promotions
     */
    public Promotions(String code, Date expiration, double percentage) {
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

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

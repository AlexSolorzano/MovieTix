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
import java.util.Random;

public class Promotion
{
    private String code; 
    private String expiration;
    private int percentage;


    public String generateCode()
    {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 5;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++)
        {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }
        return sb.toString();
    }
    public Promotion(){};
    public Promotion( String expiration, int percentage) {
        this.code = generateCode();
        this.expiration = expiration;
        this.percentage = percentage;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code){
        this.code=code;
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

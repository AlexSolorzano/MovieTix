/*
 * class: Users 
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/1/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the registered users
 * 
 * TO-DO:
 * 
 */
package Users;

public class Users {
    
    private String fname;
    private String lname; 
    private String email; 
    private String password; 
    private String address;
    private String cardType;
    private int phoneNumber;
    private int age; 
    private int cardNum;
    private int cardExp;
    private int cardZip;
    private int accountID;
    private int authorization; 
    private boolean subscribed;
    private boolean suspended; 
    
    /*
     * Users(fname, lname, email, password)
     * ----------------------------------------
     * This our our constructor for the Users class. This will be used by 
     * registered Users. 
     * 
     * registered users authentication: 1(registered)
     */
    public Users(String fname, String lname, String email, String password) {
        this.fname = fname; 
        this.lname = lname; 
        this.email = email; 
        this.password = password;
        this.authorization = 1;
    }

        /*
     * Users() 
     * ------------------------
     * This is our default constructor for the Users class. This will be 
     * used for lurkers/customers that our viewing our page without having 
     * a registered account. They have the lowest authorization level and 
     * cannot checkout until they register as a user with the system.
     * 
     * lurker authentication: 0(no security level)
     */
    public Users() {
       this.fname = null;
       this.lname = null;
       this.email = null;
       this.password = null;
       this.address = null;
       this.cardType = null;
       this.phoneNumber = 0;
       this.age = 0;
       this.cardExp = 0;
       this.cardZip = 0;
       this.accountID = 0;
       this.authorization = 0;
       this.subscribed = false; 
       this.suspended = false; 
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCardExp() {
        return cardExp;
    }

    public void setCardExp(int cardExp) {
        this.cardExp = cardExp;
    }

    public int getCardZip() {
        return cardZip;
    }

    public void setCardZip(int cardZip) {
        this.cardZip = cardZip;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAuthorization() {
        return authorization;
    }

    public void setAuthorization(int authorization) {
        this.authorization = authorization;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
} // Users

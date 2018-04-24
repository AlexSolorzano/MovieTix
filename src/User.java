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


public class User {
    
    private String firstname;
    private String lastname; 
    private String email; 
    private String password; 
    private String address;
    private int authorization; 
    private String subscribed;
    private String suspended;
    private String userID;
    
    public User()
    {
        
    }

    public User( String userID, String firstname, String lastname, String email, String password,
                 String address,String subscribed, int authorization, String suspended)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.authorization=authorization;
        this.address=address;
        this.subscribed=subscribed;
        this.suspended=suspended;
        this.userID=userID;
    }
   //SIGN UP
    public User(String fname, String lname, String email, String password) {
        this.firstname = fname; 
        this.lastname = lname; 
        this.email = email; 
        this.password = password;
        this.authorization=0;
        this.address="";
        this.subscribed="false";
        this.suspended="false";
        this.userID=createUserID(email);
    }
    
    //SIGN IN
    public User(String userID, String password){
        this.userID=userID;
        this.password=password;
    }
        
    public String createUserID(String email)
    {
        char c='@';
        int i = email.indexOf(c);
        String s = email.substring(0,i);
        return s;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public int getAuthorization() {
        return authorization;
    }

    public void setAuthorization(int a) {
        this.authorization = a;
    }

    public String getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(String subscribed) {
        this.subscribed = subscribed;
    }

    public String getSuspended() {
        return suspended;
    }

    public void setSuspended(String suspended) {
        this.suspended = suspended;
    }
    
    public String getUserID(){
        return userID;   
    }
    
    public void setUserID(String id){
        this.userID = id;   
    }
    
} // Users

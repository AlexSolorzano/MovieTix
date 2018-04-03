/*
 * class: SystemAdmins
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/1/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the registered System Administrators in our project
 * 
 * TO-DO: 
 * Potentially a memeber function for upgrading other admins
 * 
 */
package users;

public class SystemAdmins {
    
    private String fname;
    private String lname;
    private String password; 
    private String address; 
    private String email;
    private int phoneNum; 
    private int ID;
    private int SSN;
    private int age;
    private int authorization;
    private boolean suspended;

    /*
     * SystemAdmins() 
     * ------------------------
     * This is the constructor for our system admin class. System admins have the 
     * highest authorization out of all classes representing participants in our system 
     */
    public SystemAdmins(String fname, String lname, String email, String password, int SSN) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.SSN = SSN;
        this.authorization = 4;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAuthorization() {
        return authorization;
    }

    public void setAuthorization(int authorization) {
        this.authorization = authorization;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
} // SystemAdmins

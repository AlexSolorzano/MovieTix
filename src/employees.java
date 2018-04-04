
/*
 * class: Employees
 *
 * @author Joseph Maloof
 * @version 1.0
 * @date 4/1/2018
 * -----------------------------------------------------------------------
 * This class is meant to represent the registered employees in our project
 * 
 * TO-DO: 
 * Potentially a memeber function for upgrading others employees (employees to managers)
 * 
 */
package Users; 

public class Employees {
    
    private String fname; 
    private String lname;
    private String email;
    private String password;
    private String address; 
    private int age; 
    private int phoneNum; 
    private int accountID;
    private int SSN; 
    private int authorization;
    private boolean suspended;

    
    /*
     * Employees() 
     * ------------------------
     * This is our constructor for the Employees class. This will be 
     * used for employees that our editing/working with our page. 
     * They have the 2nd authorization level and 
     * cannot checkout until they register as a user with the system. 
     *
     * authorization levels for employess: 2(employees) & 3(managers)
     */
    public Employees(String fname, String lname, String email, String password, int SSN) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.SSN = SSN;
        this.authorization = 2;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
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
    
} // Employees 

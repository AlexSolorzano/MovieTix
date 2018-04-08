import java.util.*;

public class VerificationCode 
{
  private String code;
  private boolean isVerified;
  private int userID;
  
  public String getCode()
  {
    return this.code;
  }
  
  public void setCode(String code)
  {
    this.code=code;
  }
  
  public String generateCode()
  {
    String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    int length = 10;
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
      for (int i = 0; i < length; i++) 
      {
          sb.append(candidateChars.charAt(random.nextInt(candidateChars
                  .length())));
      }
      return sb.toString();  
  }
  
  public boolean getIsVerified() {
    return isVerified; 
  }
  
  public void setIsVerified(boolean isVerified) {
    this.isVerified = isVerified; 
  }
  
  public int getUserID() {
    return userID; 
  }
  
  public void setUserID(int userID) {
     this.userID = userID;
  }

}

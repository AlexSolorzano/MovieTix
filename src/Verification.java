import java.util.*;

public class Verification
{
  private String code;
  private String isVerified;
  private String email;
  
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
    public String getCode()
  {
    return this.code;
  }
  
  public void setCode(String code)
  {
    this.code=code;
  }
  
  public String getIsVerified() {
    return isVerified; 
  }
  
  public void setIsVerified(String isVerified) {
    this.isVerified = isVerified; 
  }
  
  public String getEmail() {
    return email; 
  }
  
  public void setUserID(String email) {
     this.email = email;
  }

}

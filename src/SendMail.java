import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
  
public class SendMail  
{  
 public static void sendVerification(String email, String code) {    
      // Recipient's email ID needs to be mentioned.
      String to = email;

      // Sender's email ID needs to be mentioned
      String from = "movietixnotification@gmail.com";
      String password = "uga12345";

      // Get system properties
      Properties p = new Properties();
      p.put("mail.smtp.auth","true");
      p.put("mail.smtp.starttls.enable","true");
      p.put("mail.smtp.host","smtp.gmail.com");
      p.put("mail.smtp.port","587");


      // Get the default Session object.
      Session session = Session.getInstance(p,new javax.mail.Authenticator()
              {
                  protected PasswordAuthentication getPasswordAuthentication()
                  {
                      return new PasswordAuthentication("movietixnotification",password);
                  }
              }                             
            );

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));//set?

         // Set Subject: header field
         message.setSubject("Verify email");

         // Now set the actual message
         message.setText("Please enter this code: \n"+code+"\n into the confirmation page in order to verify your account\n"+"Link: localhost::8080//MovieTix/accountConfirmation\n"
         +"THANK YOU!");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
    
    
    
public static void subscribedCon(String email){
    // Recipient's email ID needs to be mentioned.
      String to = email;

      // Sender's email ID needs to be mentioned
      String from = "movietixnotification@gmail.com";
      String password = "uga12345";

      // Get system properties
      Properties p = new Properties();
      p.put("mail.smtp.auth","true");
      p.put("mail.smtp.starttls.enable","true");
      p.put("mail.smtp.host","smtp.gmail.com");
      p.put("mail.smtp.port","587");


      // Get the default Session object.
      Session session = Session.getInstance(p,new javax.mail.Authenticator()
              {
                  protected PasswordAuthentication getPasswordAuthentication()
                  {
                      return new PasswordAuthentication("movietixnotification",password);
                  }
              }                             
            );

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));//set?

         // Set Subject: header field
         message.setSubject("Subscribed Notification");

         // Now set the actual message
         message.setText("Thank you for subscribing! Look out for awesome deals and promotions.");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
    
}

 public static void sendPassword(String email,String psswd) {    
      // Recipient's email ID needs to be mentioned.
      String to = email;

      // Sender's email ID needs to be mentioned
      String from = "movietixnotification@gmail.com";
      String password = "uga12345";

      // Get system properties
      Properties p = new Properties();
      p.put("mail.smtp.auth","true");
      p.put("mail.smtp.starttls.enable","true");
      p.put("mail.smtp.host","smtp.gmail.com");
      p.put("mail.smtp.port","587");


      // Get the default Session object.
      Session session = Session.getInstance(p,new javax.mail.Authenticator()
              {
                  protected PasswordAuthentication getPasswordAuthentication()
                  {
                      return new PasswordAuthentication("movietixnotification",password);
                  }
              }                             
            );

      try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));//set?

         // Set Subject: header field
         message.setSubject("Password Retrieval");

         // Now set the actual message
         message.setText("Here is your password: \n"+ psswd +"\n ya idiot!\n"+"Go back home and log in. \n Link: localhost::8080//MovieTix/home \n"
         +"THANK YOU!");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }    



}
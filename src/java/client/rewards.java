
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class rewards extends ActionSupport {
    final static private String FAILURE="failure";
    private String code;
    private String point;
 private String cid;
 private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
private int out;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public rewards() {
    }
    
    public String execute() throws Exception {
         Integer rew=0;
        try{
           
            Map session = ActionContext.getContext().getSession();
        
         cid=(String)session.get("userName"); 
      Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select c_id,reward,c_email from clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
             if(rs.getString(1).equals(cid))
                 
             {
                 email=rs.getString(3);
                 if(Integer.parseInt(rs.getString(2))<Integer.parseInt(point)){
                  return FAILURE;
                             }
                 else{out=1;
                 rew=Integer.parseInt(rs.getString(2))-Integer.parseInt(point);
                 }
             }
            }
            con1.close();
         }
        catch(Exception e){
         }
         try{  
      Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str1="Update clients set reward=? where c_id=?";
                          PreparedStatement ps=con1.prepareStatement(str1);
                          ps.setString(2,cid);
                        ps.setString(1,rew.toString());
                         ps.executeUpdate();
                      con1.close();
         }
        catch(Exception e){
         }
          try {
              String from = "sahara.yhr@gmail.com";
        String to = email;
        String subject = "IMP:Sahara Bank";
        String message1 = "Greetings"+"/nYour have applied for a reward, it will be delivered to you in 7 days."+"/nAdministrator"+"/nSahara Bank";
        String login = "sahara.yhr@gmail.com";
        String password = "sahara123#";
            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");

            Authenticator auth = new SMTPAuthenticator(login, password);

            Session session = Session.getInstance(props, auth);

            MimeMessage msg = new MimeMessage(session);
            msg.setText(message1);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            Transport.send(msg);

        } catch (AuthenticationFailedException ex) {
          

        } catch (AddressException ex) {
            

        } catch (MessagingException ex) {
           
        }
        return SUCCESS;
    }
    public void validate()
    {
        if(code.length()==0)
            addFieldError("code","Please enter a code");
        if(code.length()!=0)
        {
             try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select * from rewards";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
             if(rs.getString(1).equals(code))
             {
                 point=rs.getString(2);
                 flag=1;
             }
            }
            if(flag==0)
                addFieldError("code","Sorry Invalid Code");
            con1.close();
             }
        catch(Exception e)
        {
            
        }
        }
    }
     private class SMTPAuthenticator extends Authenticator {

        private PasswordAuthentication authentication;
     public SMTPAuthenticator(String login, String password) {
            authentication = new PasswordAuthentication(login, password);
        }

        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }
    }
}

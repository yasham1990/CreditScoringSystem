/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

    
/**
 *
 * @author yasham
 */
public class Datatoadmin extends ActionSupport {
    final static private String REJECT="reject";
    private String id;
 private String score;
  private String card;
   private String name;
   private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Datatoadmin() {
    }
    
    public String execute() throws Exception {
        out=1;
          try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT app_no,fname,lname,card_type,email FROM  register1";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         while(rs.next())
                         {
                             if(id.equals(rs.getString(1)))
                                     {
                                         name=rs.getString(2)+" "+rs.getString(3);
                                         card=rs.getString(4);
                                         email=rs.getString(5);
                                     }    
                                 
                         }
                         con1.close();
         }
            catch(Exception e)
            {
                
            }
         try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str="Insert into adminappreq values(?,?,?,?)  ";
                  PreparedStatement ps=con1.prepareStatement(str);
                         ps.setString(1, id);
                        ps.setString(2, name);
                        ps.setString(3, card);
                        ps.setString(4, score);
                        ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
          try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str="Delete from managerappid where app_no=?  ";
                  PreparedStatement ps=con1.prepareStatement(str);
                         ps.setString(1, id);
                         ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
        return SUCCESS;
    }
    public String reject()
    {
           try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select app_no,EMAIL from register1";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            while(rs.next())
                         {
                           if(id.equals(rs.getString(1)))
                                     {
                          email=rs.getString(2);
                                     }
                         }
                            rs.close();
             String str2="UPDATE furdetails set appstatus='REJECTED' where app_no=?";
                  PreparedStatement ps=con1.prepareStatement(str2);
                         ps.setString(1, id);
                         ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
          try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str="Delete from managerappid where app_no=?  ";
                  PreparedStatement ps=con1.prepareStatement(str);
                         ps.setString(1, id);
                         ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
           try {
              String from = "sahara.yhr@gmail.com";
        String to = email;
        String subject = "IMP:Sahara Bank";
        String message1 = "Greetings"+"\nYour Application for credit card has been REJECTED.Please contact the bank for further details."+"\nAdministrator"+"\nSahara Bank";
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
        return REJECT;
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

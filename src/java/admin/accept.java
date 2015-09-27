/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import Home.Reach;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author yasham
 */
public class accept extends ActionSupport {
    final static private String REJECT="reject";
    final static private String ACCEPT="accept";
    public accept() {
    }
    
  private String id;
  private String appno;
  private String name;
  private String pass;
  private String phone;
  private String email;
  private Date dob;
  private Date dor;
  private String reward;
private String totamount;

    public String getTotamount() {
        return totamount;
    }

    public void setTotamount(String totamount) {
        this.totamount = totamount;
    }
    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
 private int out;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  private String gender;
  private String address;

   private String cardtype;
  private String cardno;
  private String cardlimit;

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

  
  private Integer cvv;



    public String execute() throws Exception {
        out=1;
         String a="";
         Integer i=1001,j,bankup=0,bankup2=0,bankup3=0,bankup1=0,flag=1;
         Long j1,i2;
       j1=Long.valueOf("5126520010011001");
          try{ 
              Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select r.app_no,r.FNAME,r.LNAME,r.MOBILE,r.EMAIL,r.BIRTH,r.SEX,r.card_type,c1.DOOR_NO,c1.STREET,c1.LANDMARK,c1.CITY,c1.STATE,c1.ZIP,c_id,c.card_no from register1 r,clients c,cdetails c1 where r.app_no=c.app_no(+) And r.app_no=c1.app_no";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         while(rs.next())
                         {
                             
                             if(appno.equals(rs.getString(1)))
                                     {
                                        appno=rs.getString(1);
                                        name=rs.getString(2)+" "+rs.getString(3);
                                        phone=rs.getString(4);
                                        email=rs.getString(5);
                                        dob=rs.getDate(6);
                                        gender=rs.getString(7);
                                        cardtype=rs.getString(8);
                                        address=rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getString(12)+" "+rs.getString(13)+" "+rs.getString(14);
                                         if(rs.getString(8).equalsIgnoreCase("Platinum"))
                                        cardlimit="100000";
                                        else if(rs.getString(8).equalsIgnoreCase("Gold"))
                                        cardlimit="50000";
                                        else
                                        cardlimit="25000";
                                     
                                      Random i1=new Random();
                                        pass=rs.getString(2).substring(0,1).toUpperCase()+"#"+i1.nextInt(10000);
                                         
                                               }
                          a=rs.getString(15);
                         if(rs.wasNull()==true){
                             id="C1001";
                             cardno=j1.toString();
                         }
                         else{
                             id=a.substring(1);
                         j=Integer.parseInt(id);
                        if(i<j)
                        {
                            i=j;
                        }
                        i2=Long.valueOf(rs.getString(16));
                       if(j1<i2)
               {
                   j1=i2;
               }flag=0;}
                         }
                         if(flag==0)
                         {
                         i++;
                         id="C"+i.toString();
                         j1+=325;
                         cardno=j1.toString();} 
                         Random cv=new Random();
                         cvv=cv.nextInt(1000);
                         reward="0";
                         if(cardtype.equalsIgnoreCase("Platinum"))
                             totamount="100000";
                         else if(cardtype.equalsIgnoreCase("Gold"))
                             totamount="50000";
                             else
                             totamount="25000";
      con1.close();
         }
          
            catch(Exception e)
            {
                
            }
         try{
             
            java.sql.Date sqld=new java.sql.Date(dob.getTime());
             java.util.Date mydate1=new Date();
             java.sql.Date sqld1=new java.sql.Date(mydate1.getTime());
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str1="Insert into clients(app_no,c_id,c_name,c_pass,c_phone,c_email,c_dob,c_dor,c_gender,c_address,card_type,card_no,card_limit,cvv_no,reward,totamount) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con1.prepareStatement(str1);
                        ps.setString(1,appno);
                        ps.setString(2,id);
                        ps.setString(3,name);
                        ps.setString(4,pass);
                        ps.setString(5,phone);
                        ps.setString(6,email);
                        ps.setDate(7,sqld);
                        ps.setDate(8,sqld1);
                        ps.setString(9,gender);
                        ps.setString(10,address);
                        ps.setString(11,cardtype);
                        ps.setString(12,cardno);
                        ps.setString(13,cardlimit);
                        ps.setString(14,cvv.toString());
                        ps.setString(15,reward);
                        ps.setString(16,totamount);
                        ps.executeUpdate();
                       
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
          try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
             String str2="UPDATE furdetails set appstatus='ACCEPTED' where app_no=?";
                  PreparedStatement ps=con1.prepareStatement(str2);
                         ps.setString(1, appno);
                         ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
       try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                            String str3="Select * from bankinfo";
                            java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str3);
           while(rs.next())
           {
               if(rs.getString(1).equals("5crore"))
               {
           bankup=Integer.parseInt(rs.getString(2))  ;      
           bankup1=Integer.parseInt(rs.getString(3));
           bankup2=Integer.parseInt(rs.getString(4))  ;      
           bankup3=Integer.parseInt(rs.getString(5));
           }   
           }
           bankup++;
           if(cardtype.equalsIgnoreCase("Silver"))
               bankup1++;
           else if(cardtype.equalsIgnoreCase("Gold"))
               bankup2++;
           else
               bankup3++;
              String str4="Update bankinfo set totalcards=?,silver=?,gold=?,platinum=? where liquid='5crore'";
              PreparedStatement ps=con1.prepareStatement(str4);
              ps.setString(1,bankup.toString());
              ps.setString(2,bankup1.toString());
              ps.setString(3,bankup2.toString());
              ps.setString(4,bankup3.toString());
              ps.executeUpdate();
              con1.close();
         }
         catch(Exception e)
         {
             
         }
       try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str5="Delete from adminappreq where app_no=?  ";
                  PreparedStatement ps=con1.prepareStatement(str5);
                         ps.setString(1, appno);
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
        String message1 = "Greetings"+"\nYour Application for credit card has been approved.Please contact the bank within seven days otherwise your application will be cancelled."+"\nAdministrator"+"\nSahara Bank";
        String login = "sahara.yhr@gmail.com";
        String password = "sahara123#";
            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");

            Authenticator auth = new admin.accept.SMTPAuthenticator(login, password);

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
           
       return ACCEPT;
    }



    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

public String reject()
    { out=1;
     
        try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select app_no,EMAIL from register1";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            while(rs.next())
                         {
                           if(appno.equals(rs.getString(1)))
                                     {
                          email=rs.getString(2);
                                     }
                         }
                            rs.close();
             String str2="UPDATE furdetails set appstatus='REJECTED' where app_no=?";
                  PreparedStatement ps=con1.prepareStatement(str2);
                         ps.setString(1, appno);
                         ps.executeUpdate();
                        con1.close();
         }
            catch(Exception e)
            {
                
            }
    try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str5="Delete from adminappreq where app_no=?  ";
                  PreparedStatement ps=con1.prepareStatement(str5);
                         ps.setString(1, appno);
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
        String message1 = "Greetings"+"\nYour Application for credit card has been rejected.Please contact the bank for details."+"\nAdministrator"+"\nSahara Bank";
        String login = "sahara.yhr@gmail.com";
        String password = "sahara123#";
            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");

            Authenticator auth = new admin.accept.SMTPAuthenticator(login, password);

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

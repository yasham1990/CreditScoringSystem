
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.Map;


public class fundtrans extends ActionSupport {
   private String cardno;
   private String cid;

private int out;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
 private String cvv; 
   private String accno; 
   private String amount; 
   private String reward;

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
  
    public fundtrans() {
    }
    
    public String execute() throws Exception {
        Integer rew=0,tot=0;
        out=1;
        if(Integer.parseInt(amount)>=0&&Integer.parseInt(amount)<5000)
            reward="0";
        else if(Integer.parseInt(amount)>=5000&&Integer.parseInt(amount)<10000)
            reward="5";
      else if(Integer.parseInt(amount)>=10000&&Integer.parseInt(amount)<20000)
            reward="10";
       else if(Integer.parseInt(amount)>=20000&&Integer.parseInt(amount)<30000)
            reward="15";
       else if(Integer.parseInt(amount)>=30000&&Integer.parseInt(amount)<50000)
            reward="20";
       else 
           reward="25";
         try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select c_id,reward,totamount from clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
             if(rs.getString(1).equals(cid))
             {
                 rew=Integer.parseInt(reward)+Integer.parseInt(rs.getString(2));
                 tot=Integer.parseInt(rs.getString(3))-Integer.parseInt(amount);
             }
            }
            con1.close();
             }
        catch(Exception e)
        {
            
        }
          try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          String str1="Update clients set reward=?,totamount=? where c_id=?";
                  PreparedStatement ps=con1.prepareStatement(str1);
                        ps.setString(1,rew.toString());
                        ps.setString(2,tot.toString());
                        ps.setString(3,cid);
                        ps.executeUpdate();
                        
                        String str11="insert into transuser(c_id,c_type,c_amount,time) values(?,?,?,sysdate)";
                        ps=con1.prepareStatement(str11);
                        ps.setString(1,cid);
                        ps.setString(2,"debit");
                        ps.setString(3,amount);
                        ps.executeUpdate();
            
            con1.close();
             }
        catch(Exception e)
        {
            
        }
     return SUCCESS;   
    }
     public void validate()
    {
     if(cardno.length()==0)
         addFieldError("cardno", "Card Number is required");
    if(cvv.length()==0)
         addFieldError("cvv", "Cvv number is required");    
     if(accno.length()==0)
         addFieldError("accno", "Account no is required");
     if(!accno.matches("^[0-9_-]{10,16}$"))
         addFieldError("accno", "Account no invalid");
     if(amount.length()==0)
         addFieldError("amount", "Amount is required");
     if(!amount.matches("^[0-9]{1,6}$"))
         addFieldError("amount", "Invalid Format or Invalid Amount"); 
      if(cardno.length()!=0&&cvv.length()!=0)
      { Map session = ActionContext.getContext().getSession();
        
         cid=(String)session.get("userName");     
            try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select c_id,card_no,cvv_no,totamount from clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(cid))
                {
                if(!rs.getString(2).equals(cardno)||!rs.getString(3).equals(cvv)){
                    flag=1;break; 
                }
                if(Integer.parseInt(amount)>Integer.parseInt(rs.getString(4)))
                 flag=2;  
            }}
            if(flag==1)
                addFieldError("cardno","Invalid cardno or cvv");
            if(flag==2)
                addFieldError("amount","Insufficient funds");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
      }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class clientview extends ActionSupport {
    
    public clientview() {
    }
     private String id;
private String name;
private String gen;
private String address;
private String phone;
private String email;
private Date dob;
private Date doj;
private String cardno;
private String cardtype;
private String cardlimit;
private String cvvno;
private String reward;
private String totamount;
private String namedis;
    public String getNamedis() {
        return namedis;
    }

    public void setNamedis(String namedis) {
        this.namedis = namedis;
    }

    public String getAddress() {
        return address;
    }
final static private String CLIENTVIEWBACK="clientviewback";
    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String execute() throws Exception {
         Map session = ActionContext.getContext().getSession();
       
        id=(String)session.get("userName");
         try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  clients";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
             if(id.equals(rs.getString(1)))
             {
               name=rs.getString(3);
               phone=rs.getString(4);
               email=rs.getString(5);
               dob=rs.getDate(6);
               doj=rs.getDate(7);
               gen=rs.getString(8);
               address=rs.getString(9);
               cardtype=rs.getString(11);
               cardno=rs.getString(12);
               cardlimit=rs.getString(13);
               cvvno=rs.getString(14);
               reward=rs.getString(15);
               totamount=rs.getString(16);
             }
            }
            con1.close();
         }
            catch(Exception e)
            {
                
            }
        return SUCCESS; 
    }

    public String getCardlimit() {
        return cardlimit;
    }

    public void setCardlimit(String cardlimit) {
        this.cardlimit = cardlimit;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getCvvno() {
        return cvvno;
    }

    public void setCvvno(String cvvno) {
        this.cvvno = cvvno;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getTotamount() {
        return totamount;
    }

    public void setTotamount(String totamount) {
        this.totamount = totamount;
    }
    public String clientviewback(){
           Map session = ActionContext.getContext().getSession();
      namedis=(String)session.get("namedis");
        return CLIENTVIEWBACK;
    }

}

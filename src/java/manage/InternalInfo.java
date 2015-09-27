/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


public class InternalInfo extends ActionSupport {
    final static private String INTERNALBACK="internalback";
  private String appno;
  private String salu;
  private String fname;
  private String lname;
  private String birth;
  private String status;
  private String sex;
  private String pan;
  private String mobile;
  private String email;
  private String annual;
  private String monthly;
  private String card_type;
  private String door;
  private String street;
  private String landmark;
  private String nationality;
  private String city;
  private String state;
  private String zip;
  private String resino;
  private String profession;
  private String ename;
  private String eid;
  private Date join;
  private String comaddress;
  private String fax;
  private String officeno;
  private String officeemail;
  private String nameappear;
  private String salaccount;
  private String salbankname;
  private String accountno;
  private String accountname;
  private String othercard;
  private String cardbank;
  private String cardhold;
  private String cardlimit;
  private Date regdate;

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getCardbank() {
        return cardbank;
    }

    public void setCardbank(String cardbank) {
        this.cardbank = cardbank;
    }

    public String getCardhold() {
        return cardhold;
    }

    public void setCardhold(String cardhold) {
        this.cardhold = cardhold;
    }

    public String getCardlimit() {
        return cardlimit;
    }

    public void setCardlimit(String cardlimit) {
        this.cardlimit = cardlimit;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getJoin() {
        return join;
    }

    public void setJoin(Date join) {
        this.join = join;
    }

 

    public String getNameappear() {
        return nameappear;
    }

    public void setNameappear(String nameappear) {
        this.nameappear = nameappear;
    }

    public String getOfficeemail() {
        return officeemail;
    }

    public void setOfficeemail(String officeemail) {
        this.officeemail = officeemail;
    }

    public String getOfficeno() {
        return officeno;
    }

    public void setOfficeno(String officeno) {
        this.officeno = officeno;
    }

    public String getOthercard() {
        return othercard;
    }

    public void setOthercard(String othercard) {
        this.othercard = othercard;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getSalaccount() {
        return salaccount;
    }

    public void setSalaccount(String salaccount) {
        this.salaccount = salaccount;
    }

    public String getSalbankname() {
        return salbankname;
    }

    public void setSalbankname(String salbankname) {
        this.salbankname = salbankname;
    }
 
  
    public InternalInfo() {
    }
    
    public String execute() throws Exception {
         Map session = ActionContext.getContext().getSession();
       
        appno=(String)session.get("id");
        try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select * from register1 r,cdetails c,edetails e,furdetails f where r.app_no=c.app_no and r.app_no=e.app_no and r.app_no=f.app_no ";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
               while( rs.next())
               {
                  
                   if(appno.equals(rs.getString(1)))
                   {
                       salu=rs.getString(2);
                       fname=rs.getString(3);
                       lname=rs.getString(4);
                       birth=rs.getString(5);
                       status=rs.getString(6);
                       sex=rs.getString(7);
                       pan=rs.getString(8);
                       mobile=rs.getString(9);
                       email=rs.getString(10);
                       annual=rs.getString(11);
                       monthly=rs.getString(12);
                       card_type=rs.getString(13);
                       door=rs.getString(15);
                       street=rs.getString(16);
                       landmark=rs.getString(17);
                       nationality=rs.getString(18);
                       city=rs.getString(19);
                       state=rs.getString(20);
                       zip=rs.getString(21);
                       resino=rs.getString(22);
                       profession=rs.getString(24);
                       ename=rs.getString(25);
                       eid=rs.getString(26);
                       join=rs.getDate(27);
                       comaddress=rs.getString(28);
                       fax=rs.getString(29);
                       officeno=rs.getString(30);
                       officeemail=rs.getString(31);
                       nameappear=rs.getString(33);
                       salaccount=rs.getString(34);
                       salbankname=rs.getString(35);
                       accountno=rs.getString(36);
                       accountname=rs.getString(37);
                       othercard=rs.getString(42);
                       cardbank=rs.getString(38);
                       cardhold=rs.getString(39);
                       cardlimit=rs.getString(40);
                       regdate=rs.getDate(41);
                   }
                   }
               con1.close();
               }
        catch(Exception e)
        {
            
               }
        return SUCCESS;
    }

    public String getAnnual() {
        return annual;
    }

    public void setAnnual(String annual) {
        this.annual = annual;
    }

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getResino() {
        return resino;
    }

    public void setResino(String resino) {
        this.resino = resino;
    }

    public String getSalu() {
        return salu;
    }

    public void setSalu(String salu) {
        this.salu = salu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
     public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String internalback(){
return INTERNALBACK;
}
}

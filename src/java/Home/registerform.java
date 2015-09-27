/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class registerform extends ActionSupport {
    
    public registerform() {
    }
    
    final static private String REGISBACK1="regisback1";


    private String prof;
    
    private String empName;
    private String empId;
    private Date dateJoin= null ;
    private String compAdd;
    private String faxNo;
    private String offNo;
    private String email;
    private String nameCard;
    private String salbankacc="";
    private String salbankname="";

    public String getSalbankname() {
        return salbankname;
    }

    public void setSalbankname(String salbankname) {
        this.salbankname = salbankname;
    }
    private String accNo="";
    private String accHoldrName="";
    private String otherbankcard="";
    private String bankName1="";
    private String cardHoldrName="";
    private String cardLimit="";
  
    private String appno;
    private String cardtype;
    private String salu;  
    private String fname;
    private String lname;
    private Date dob=null;
    private String city;
    private String state;
    private String country;
    private String mobile;
    private String pan;
    private String email1;
    private String sex;
    private String status;
    private String annualinc;
    private String monthlyinc;
    private String door;
    private String street;
    private String lmark;
    private String zip;
    private String resi;
    private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public String getOtherbankcard() {
        return otherbankcard;
    }

    public void setOtherbankcard(String otherbankcard) {
        this.otherbankcard = otherbankcard;
    }

    public String getSalbankacc() {
        return salbankacc;
    }

    public void setSalbankacc(String salbankacc) {
        this.salbankacc = salbankacc;
    }
     public Date getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        this.dateJoin = dateJoin;
    } 
    
   public String getOffNo() {
        return offNo;
    }

    public void setOffNo(String offNo) {
        this.offNo = offNo;
    }
    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
    public String getAccHoldrName() {
        return accHoldrName;
    }

    public void setAccHoldrName(String accHoldrName) {
        this.accHoldrName = accHoldrName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

 

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    public String getCardHoldrName() {
        return cardHoldrName;
    }

    public void setCardHoldrName(String cardHoldrName) {
        this.cardHoldrName = cardHoldrName;
    }

    public String getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(String cardLimit) {
        this.cardLimit = cardLimit;
    }

    public String getCompAdd() {
        return compAdd;
    }

    public void setCompAdd(String compAdd) {
        this.compAdd = compAdd;
    }

   


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

   
    
     
    public String execute() throws Exception {
 out=1;
  Map session = ActionContext.getContext().getSession();
       
        cardtype=(String) session.get("card");
        salu=(String) session.get("salu");
        fname=(String) session.get("fname");
        lname=(String)session.get("lname");
        dob=(Date)session.get("dob");
        city=(String)session.get("city");
        state=(String)session.get("state");
        country=(String)session.get("country");
        mobile=(String)session.get("mobile");
        pan=(String)session.get("pan");
        email1=(String)session.get("email");
        sex=(String)session.get("sex");
        status=(String)session.get("status");
        annualinc=(String)session.get("annualinc");
        
        monthlyinc=(String)session.get("monthlyinc");
        door=(String)session.get("door");
        street=(String)session.get("street");
        lmark=(String)session.get("lmark");
        zip=(String)session.get("zip");
        resi=(String)session.get("resi");
        try{
       
             java.sql.Date sqld=new java.sql.Date(dob.getTime());
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str1="Insert into register1 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con1.prepareStatement(str1);
                        ps.setString(1,appno);
                        ps.setString(2,salu);
                        ps.setString(3,fname);
                        ps.setString(4,lname);
                        ps.setDate(5,sqld);
                        ps.setString(6,status);
                        ps.setString(7,sex);
                        ps.setString(8,pan);
                        ps.setString(9,mobile);
                        ps.setString(10,email);
                        ps.setString(11,annualinc);
                        ps.setString(12,monthlyinc);
                        ps.setString(13,cardtype);
                        ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        }
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
             String str="Insert into cdetails values(?,?,?,?,?,?,?,?,?)";
             PreparedStatement ps=con1.prepareStatement(str);
                        ps.setString(1,appno);
                        ps.setString(2,door);
                        ps.setString(3,street);
                        ps.setString(4,lmark);
                        ps.setString(5,country);
                        ps.setString(6,city);
                        ps.setString(7,state);
                        ps.setString(8,zip);
                        ps.setString(9,resi);
                        ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        } 
          try{
       
             java.sql.Date sqld4=new java.sql.Date(dateJoin.getTime());
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str9="Insert into edetails values(?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con1.prepareStatement(str9);
                        ps.setString(1,appno);
                        ps.setString(2,prof);
                        ps.setString(3,empName);
                        ps.setString(4,empId);
                        ps.setDate(5,sqld4);
                        ps.setString(6,compAdd);
                        ps.setString(7,offNo);
                        ps.setString(8,faxNo);
                        ps.setString(9,email);
                       
                        ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        }
           try{
        java.util.Date mydate1=new Date();
             java.sql.Date sqld1=new java.sql.Date(mydate1.getTime());
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          
	       		  String str9="Insert into furdetails(app_no,name_appear,salary_acc,bank_name,acc_no,acc_name,bank,card_holder,card_limit,reg_date,other_card) values (?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con1.prepareStatement(str9);
                        ps.setString(1,appno);
                        ps.setString(2,nameCard);
                        ps.setString(3,salbankacc);
                        ps.setString(4,salbankname);
                        ps.setString(5,accNo);
                        ps.setString(6,accHoldrName);
                        ps.setString(7,bankName1);
                        ps.setString(8,cardHoldrName);
                        ps.setString(9,cardLimit);
                        ps.setDate(10,sqld1);
                        ps.setString(11,otherbankcard);
                        ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        }
         try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
             String str="Insert into reguser values(?,?,?)";
             PreparedStatement ps=con1.prepareStatement(str);
                        ps.setString(1,appno);
                        ps.setString(2,cardtype);
                        ps.setString(3,fname+" "+lname);
                        
                        ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        } 
      
                 session.remove("card");
                  session.remove("salu");
                  session.remove("fname");
                  session.remove("lname");
                  session.remove("dob");
                  session.remove("city");
                  session.remove("state");
                  session.remove("country");
                  session.remove("mobile");
                  session.remove("email");
                  session.remove("sex");
                  session.remove("status");
                  session.remove("annualinc");
                  session.remove("monthlyinc");
                  session.remove("door");
                  session.remove("street");
                  session.remove("lmark");
                  session.remove("zip");
                  session.remove("resi");
                 
      
        return SUCCESS;
    }

    public String getAnnualinc() {
        return annualinc;
    }

    public void setAnnualinc(String annualinc) {
        this.annualinc = annualinc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLmark() {
        return lmark;
    }

    public void setLmark(String lmark) {
        this.lmark = lmark;
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

    public String getMonthlyinc() {
        return monthlyinc;
    }

    public void setMonthlyinc(String monthlyinc) {
        this.monthlyinc = monthlyinc;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getSalu() {
        return salu;
    }

    public void setSalu(String salu) {
        this.salu = salu;
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
    public void validate()
    {
        if(salbankacc.length()==0)
            addFieldError("accNo","Please enter a choice");
         if(otherbankcard.length()==0)
            addFieldError("bankName1","Please enter a choice");
         if(salbankacc.equals("Yes"))
        {
            if(salbankname.length()==0)
                 addFieldError("salbankname","Please Enter bankname");
            else if(!salbankname.matches("^[A-Za-z]{1,10}$")){
                addFieldError("salbankname","Name can contain only characters");
            }
            if(accNo.length()==0)
                addFieldError("accNo","Please Enter account number");
             else if(!accNo.matches("^[0-9]{12,16}$"))
                addFieldError("accNo","Please Enter correct account number");
            if(accHoldrName.length()==0)
                addFieldError("accHoldrName","Please Enter account Holder name");
            
          
           
        }
        if(otherbankcard.equals("Yes"))
        {
            if(bankName1.length()==0)
                addFieldError("bankName1","Please Enter bankname");
            else if(!bankName1.matches("^[A-Za-z]{1,10}$")){
                addFieldError("bankName1","Name can contain only characters");
            }
            if(cardHoldrName.length()==0)
                addFieldError("cardHoldrName","Please Enter card Holder name");
            if(cardLimit.length()==0)
                addFieldError("cardLimit","Please Enter card limit");
            else if(!cardLimit.matches("^[0-9]{5,10}$"))
                addFieldError("cardLimit","Please enter correct number");
           
        }
    }
        public String regisback(){
    return REGISBACK1;
}
}



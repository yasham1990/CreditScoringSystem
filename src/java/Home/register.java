
package Home;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class register extends ActionSupport{
   

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
private String appno;

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }
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
  private String email;
  private String sex="";
  private String status="";
  private String annualinc;
  private String monthlyinc;
  private String door;
  private String street=null;
  private String lmark;
  private String zip;
  private String resi=null;
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
 

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
 

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getLmark() {
        return lmark;
    }

    public void setLmark(String lmark) {
        this.lmark = lmark;
    }

    public String getResi() {
        return resi;
    }

    public void setResi(String resi) {
        this.resi = resi;
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

    public String getAnnualinc() {
        return annualinc;
    }

    public void setAnnualinc(String annualinc) {
        this.annualinc = annualinc;
    }

    public String getMonthlyinc() {
        return monthlyinc;
    }

    public void setMonthlyinc(String monthlyinc) {
        this.monthlyinc = monthlyinc;
    }




    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

  
 
  public String getSalu() {
        return salu;
    }

    public void setSalu(String salu) {
        this.salu = salu;
    }
     
     public String getFname() {
        return fname;
    }

   

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;

    } 
  
    
    @Override
     public String execute() {
     
try{
   Integer i=1001,j=0;
     String a;
 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
          		  String str="select app_no from register1 ";
                           java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         if(rs.isBeforeFirst()==false)
                           {
                            appno="A1001";   
                            
                           }else{
                         while(rs.next())
                         {
                             a=rs.getString(1);
                             appno=a.substring(1);
                             j=Integer.parseInt(appno);
                             if(i<j)
                             {
                               i=j;  
                             }
                         }
                          i++;
                         appno="A"+i.toString();
                           }
                          con1.close();
}
catch(Exception e)
{}
Map session = ActionContext.getContext().getSession();
session.put("card",cardtype);
session.put("salu",salu);
session.put("fname",fname);
session.put("lname",lname);
session.put("dob",dob);
session.put("city",city);
session.put("state",state);
session.put("country",country);
session.put("mobile",mobile);
session.put("pan",pan);
session.put("email",email);
session.put("annualinc",annualinc);
session.put("monthlyinc",monthlyinc);
session.put("door",door);
session.put("street",street);
session.put("lmark",lmark);
session.put("zip",zip);
session.put("resi",resi);
session.put("status",status);
session.put("sex",sex);
session.put("appno",appno);
                return SUCCESS;
    }
    @Override
      public void validate() {
 Long i,j;
  
 if(annualinc.length()==0)
 {
    
     addFieldError("annualinc", "Annual Income Required");
 }
 if(monthlyinc.length()==0)
 {
    
      addFieldError("monthlyinc","Monthly Income Required");
 }
 else if(!annualinc.matches("^[0-9_-]{1,30}$")){
     addFieldError("annualinc", "Annual Income accepted in numbers only");
 } 
 else if(!monthlyinc.matches("^[0-9_-]{1,30}$")){
     addFieldError("monthlyinc", "Monthly Income accepted in numbers only");
 } 
 else {
     i=Long.valueOf(annualinc);
     j=Long.valueOf(monthlyinc);
     if((i/12)!=j)
         addFieldError("monthlyinc", "invalid");
 }
     
}
 public register()
{
    	
}

   
}


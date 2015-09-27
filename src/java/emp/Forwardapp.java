package emp;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;

/**
 *
 * @author RANA
 */
public class Forwardapp extends ActionSupport {
    private String id;
    private String fname;
    private String lname;
    private String address="";
    private String email;
    private String mob;
    private String members;
    private String harea;
    private String hloan="";
    private String hinstal="";
    private String cars;
    private String carloan="";
    private String cinstal="";
    private String bill="";
    private String crime="";
    private String othcard="";
    private String inc;
    private String fd;
    private String netfd;
    private String agland;
    private String lic;
    private String bdflt;
    private String tax;
    private String othinc="";
    private String card;
   private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
 
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAgland() {
        return agland;
    }

    public void setAgland(String agland) {
        this.agland = agland;
    }

    public String getBdflt() {
        return bdflt;
    }

    public void setBdflt(String bdflt) {
        this.bdflt = bdflt;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCarloan() {
        return carloan;
    }

    public void setCarloan(String carloan) {
        this.carloan = carloan;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getCinstal() {
        return cinstal;
    }

    public void setCinstal(String cinstal) {
        this.cinstal = cinstal;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getHarea() {
        return harea;
    }

    public void setHarea(String harea) {
        this.harea = harea;
    }

    public String getHinstal() {
        return hinstal;
    }

    public void setHinstal(String hinstal) {
        this.hinstal = hinstal;
    }

    public String getHloan() {
        return hloan;
    }

    public void setHloan(String hloan) {
        this.hloan = hloan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    public String getLic() {
        return lic;
    }

    public void setLic(String lic) {
        this.lic = lic;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getNetfd() {
        return netfd;
    }

    public void setNetfd(String netfd) {
        this.netfd = netfd;
    }

    public String getOthcard() {
        return othcard;
    }

    public void setOthcard(String othcard) {
        this.othcard = othcard;
    }

    public String getOthinc() {
        return othinc;
    }

    public void setOthinc(String othinc) {
        this.othinc = othinc;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

        
    public String execute() throws Exception {
        out=1;
         try{ 
            
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
             String str1="insert into extverify1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement ps=con1.prepareStatement(str1);
                         ps.setString(1,id);
                         ps.setString(2,fname);
                         ps.setString(3,lname);
                         ps.setString(4,address);
                         ps.setString(5,email);
                         ps.setString(6,mob);
                         ps.setString(7,members);
                         ps.setString(8,harea);
                         ps.setString(9,hloan);
                         ps.setString(10,hinstal);
                         ps.setString(11,bill);
                         ps.setString(12,cars);
                         ps.setString (13,carloan);
                         ps.setString (14,cinstal);
                         ps.setString (15,inc);
                         ps.setString (16,fd);
                         ps.setString (17,netfd);
                         ps.setString (18,agland);
                         ps.setString (19,lic);
                         ps.setString (20,bdflt);
                         ps.setString (21,tax);
                         ps.setString(22,crime);
                         ps.setString (23,othinc);
                         ps.setString (24,othcard);
                         ps.executeUpdate();
                        con1.close();
                        
         }
            catch(Exception e)
            {
                System.out.println(e);  
            }
 try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
                    /*Establish a connection with a data source*/
     Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
     String str1="select app_no,c_cardtype from REGUSER";
     java.sql.Statement st=con2.createStatement();
     ResultSet rs=st.executeQuery(str1);
     
     while(rs.next()){
      if(id.equals(rs.getString(1)))
     {
          card = rs.getString(2);
     }
     }    
 }
 catch (Exception exp)
 {
     System.out.println(exp);
 }
 
 try{           
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
         String str1="insert into managerappid(app_no,c_cardtype,c_name) values(?,?,?) ";        
         PreparedStatement ps=con3.prepareStatement(str1);
                   ps.setString(1,id);
                   ps.setString(2,card);
                   ps.setString(3,fname);
                   ps.executeUpdate();
                        con3.close();
        }  
 
  catch(Exception ae)
            {
                System.out.println(ae);  
            }
 try{ 
            
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
 Connection con2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
 String str1="delete from reguser where app_no=?";        
  PreparedStatement ps=con2.prepareStatement(str1);
                   ps.setString(1,id);
                   ps.executeUpdate();
                        con2.close();
        }  
 
  catch(Exception ae)
            {
                System.out.println(ae);  
            }
 return SUCCESS;
    }

     
    public void validate(){
        if(address.length()==0)
            addFieldError("address", "Please select a choice");
        if(hloan.length()==0)
            addFieldError("hloan", "Please select a choice");
        if(hinstal.length()==0)
            addFieldError("hinstal", "Please select a choice");
        if(bill.length()==0)
            addFieldError("bill", "Please select a choice");
        if(carloan.length()==0)
            addFieldError("carloan", "Please select a choice");
        if(cinstal.length()==0)
            addFieldError("cinstal", "Please select a choice");
        if(crime.length()==0)
            addFieldError("crime", "Please select a choice");
        if(othcard.length()==0)
            addFieldError("othcard", "Please select a choice");
         if(othinc.length()==0)
            addFieldError("othinc", "Please select a choice");
    }
}
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
import java.util.Date;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class ExternalInfo extends ActionSupport {
    
    public ExternalInfo() {
    }
    final static private String EXTERNALBACK="externalback";
  private String appno;
  private String fname;
  private String lname;
  private String address;
  private String mobile;
  private String email;
  private String member;
  private String area;
  private String hloan;
  private String hpaid;
  private String billpay;
  private String cars;
  private String cloan;
  private String cpaid;
  private String income;
  private String nfd;
  private String fdamount;
  private String agland;
  private String lic;
  private String bankdefault;
  private String tax;
  private String crime;
  private String otherinc;
  private String otherbankcard;
   
    
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
       
        appno=(String)session.get("id");
        try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select * from extverify1 ";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
               while( rs.next())
               {
                   
                   if(appno.equals(rs.getString(1)))
                   {
                      
                       fname=rs.getString(2);
                       lname=rs.getString(3);
                       address=rs.getString(4);
                       email=rs.getString(5);
                       mobile=rs.getString(6);
                       member=rs.getString(7);
                       area=rs.getString(8);
                       hloan=rs.getString(9);
                       hpaid=rs.getString(10);
                       billpay=rs.getString(11);
                       cars=rs.getString(12);
                       cloan=rs.getString(13);
                       cpaid=rs.getString(14);
                       income=rs.getString(15);
                       nfd=rs.getString(16);
                       fdamount=rs.getString(17);
                       agland=rs.getString(18);
                       lic=rs.getString(19);
                       bankdefault=rs.getString(20);
                       tax=rs.getString(21);
                       crime=rs.getString(22);
                       otherinc=rs.getString(23);
                       otherbankcard=rs.getString(24);
                   }
                   }
               con1.close();
               }
        catch(Exception e)
        {
            
               }
        return SUCCESS;
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

    public String getAppno() {
        return appno;
    }

    public void setAppno(String appno) {
        this.appno = appno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

   

    public String getBillpay() {
        return billpay;
    }

    public void setBillpay(String billpay) {
        this.billpay = billpay;
    }

  

    public String getCloan() {
        return cloan;
    }

    public void setCloan(String cloan) {
        this.cloan = cloan;
    }

    public String getCpaid() {
        return cpaid;
    }

    public void setCpaid(String cpaid) {
        this.cpaid = cpaid;
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

   

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getHloan() {
        return hloan;
    }

    public void setHloan(String hloan) {
        this.hloan = hloan;
    }

    public String getHpaid() {
        return hpaid;
    }

    public void setHpaid(String hpaid) {
        this.hpaid = hpaid;
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

    
    public String getOtherbankcard() {
        return otherbankcard;
    }

    public void setOtherbankcard(String otherbankcard) {
        this.otherbankcard = otherbankcard;
    }

    public String getOtherinc() {
        return otherinc;
    }

    public void setOtherinc(String otherinc) {
        this.otherinc = otherinc;
    }

    public String getBankdefault() {
        return bankdefault;
    }

    public void setBankdefault(String bankdefault) {
        this.bankdefault = bankdefault;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getFdamount() {
        return fdamount;
    }

    public void setFdamount(String fdamount) {
        this.fdamount = fdamount;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getLic() {
        return lic;
    }

    public void setLic(String lic) {
        this.lic = lic;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getNfd() {
        return nfd;
    }

    public void setNfd(String nfd) {
        this.nfd = nfd;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

   public String externalback(){
return EXTERNALBACK;
}

}

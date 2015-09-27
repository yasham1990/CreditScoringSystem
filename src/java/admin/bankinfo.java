
package admin;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;

public class bankinfo extends ActionSupport {
    
    public bankinfo() {
    }
    
  private String liquid;
  private String totalcards;
  private String silver;
  private String gold;
  private String platinum;
  private String employee;
  private String manager;
  private String maincost;
  private Date dos;
  final static private String BANKINFOBACK="bankinfoback";
public String bankinfoback(){
  return BANKINFOBACK;  
}
    public String execute() throws Exception {
          try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select * from bankinfo where liquid='5crore' ";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
               while( rs.next())
               {
                       liquid=rs.getString(1);
                       totalcards=rs.getString(2);
                       silver=rs.getString(3);
                       gold=rs.getString(4);
                       platinum=rs.getString(5);
                       employee=rs.getString(6);
                       manager=rs.getString(7);
                       maincost=rs.getString(8);
                       dos=rs.getDate(9);
               }
               con1.close();
    }
          catch(Exception e)
          {
              
          }
          return SUCCESS;
    }

    public Date getDos() {
        return dos;
    }

    public void setDos(Date dos) {
        this.dos = dos;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getLiquid() {
        return liquid;
    }

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }

    public String getMaincost() {
        return maincost;
    }

    public void setMaincost(String maincost) {
        this.maincost = maincost;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPlatinum() {
        return platinum;
    }

    public void setPlatinum(String platinum) {
        this.platinum = platinum;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getTotalcards() {
        return totalcards;
    }

    public void setTotalcards(String totalcards) {
        this.totalcards = totalcards;
    }
}

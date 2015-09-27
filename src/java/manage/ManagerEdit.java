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
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author yasham
 */
public class ManagerEdit extends ActionSupport {
    
    public ManagerEdit() {
    }
    private List<String> h2;

    public List<String> getH2() {
        return h2;
    }

    public void setH2(List<String> h2) {
        this.h2 = h2;
    }
    private String id;
private String name;
private String gen;
private String address;
private String phone;
private String email;
private String salary;
private Date dob;
private Date doj;
final static private String MANAGEEDIT="manageedit";

    public String getAddress() {
        return address;
    }

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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

  
    
    public String execute() throws Exception {
         try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  employee";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
             if(id.equals(rs.getString(1)))
             {
               name=rs.getString(2);
               gen=rs.getString(9);
               address=rs.getString(4);
              
               phone=rs.getString(5);
               email=rs.getString(6);
               salary=rs.getString(7);
               dob=rs.getDate(8);
               doj=rs.getDate(10);
             }
            }
            con1.close();
         }
            catch(Exception e)
            {
                
            }
        return MANAGEEDIT; 
    }
  
    public void validate()
    {
          Map session = ActionContext.getContext().getSession();
       
        h2=(List<String>)session.get("h2");
        int flag=0;
     if(getId().length()==0)
         addFieldError("id", "Application Id is required");
      if(id.length()!=0)
      {
          String a="";
            try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT e_id FROM  employee";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {               
                if(rs.getString(1).equals(getId()))
                    flag=1;
            }
            if(flag==0)
            addFieldError("id","Invalid application id");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }

    }
}
}
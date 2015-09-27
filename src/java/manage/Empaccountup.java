package manage;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author yasham
 */
public class Empaccountup extends ActionSupport {
    
    final static private String EMPUPDATE="empupdate";
  
    final static private String EMPDELETE="empdelete";
    public Empaccountup() {
    }
      private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
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
    


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        out=1;
         try{    
            
             java.sql.Date sqld=new java.sql.Date(dob.getTime());
  
             
             Class.forName("oracle.jdbc.driver.OracleDriver");
             /*Establish a connection with a data source*/
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
             String str1="Update employee set e_id=?,e_gen=?,e_name=?,e_address=?,e_phone=?,e_email=?,e_salary=?,e_dob=? where e_id=?";
             PreparedStatement ps=con1.prepareStatement(str1);
             ps.setString(1,id);
             ps.setString(2,gen);
             ps.setString(3,name);
             ps.setString(4,address);
             ps.setString(5,phone);
             ps.setString(6,email);
             ps.setString(7,salary);
             ps.setDate(8,sqld);
            
             ps.setString(9,id);
             ps.executeUpdate();
             con1.close();
         }
          
         catch(Exception e)
            {
                
            }
        
      return EMPUPDATE;
    }
   
    public String empdelete()
    {
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                            String str1="delete from employee where e_id=?";
                  PreparedStatement ps=con1.prepareStatement(str1);
                   ps.setString(1,id);
                   ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        }
        return EMPDELETE;
    }
  
          public void validate()
    {
    if(getName().length()==0)
         addFieldError("name", "Name is required");  
   else if(!getName().matches("^[A-Za-z ]{1,30}$"))
     addFieldError("name", "Only alphabets allowed");
     if(getGen().length()==0)
         addFieldError("gen", "Gender is required");
      else if(!getGen().equalsIgnoreCase("male")&&!getGen().equalsIgnoreCase("female"))
         addFieldError("gen","Invalid Detail");
     if(getAddress().length()==0)
         addFieldError("address", "Address is required");   
    }

}

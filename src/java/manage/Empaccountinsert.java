/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author yasham
 */
public class Empaccountinsert extends ActionSupport {
      final static private String EMPINSERT="empinsert";
            
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
    private String pass;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
    public Empaccountinsert() {
    }
    
     public String execute()
    {
        out=1;
        Integer i=0;
         try{ 
             Random forp=new Random();
        pass=name.substring(0,1).toUpperCase()+"#"+"abc"+forp.nextInt(1000);
          java.sql.Date sqld=new java.sql.Date(dob.getTime());
          java.sql.Date sqld1=new java.sql.Date(doj.getTime());
             Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                            String str1="Insert into employee(e_id,e_gen,e_name,e_address,e_phone,e_email,e_salary,e_dob,e_doj,e_pass) values(?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement ps=con1.prepareStatement(str1);
                         ps.setString(1,id);
                         ps.setString(2,gen);
                         ps.setString(3,name);
                         ps.setString(4,address);
                         ps.setString(5,phone);
                         ps.setString(6,email);
                         ps.setString(7,salary);
                         ps.setDate(8,sqld);
                         ps.setDate(9,sqld1);
                         ps.setString(10,pass);
                         ps.executeUpdate();
                        con1.close();
                        
         }
            catch(Exception e)
            {
                
            }
         try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                            String str2="Select * from bankinfo where liquid='5crore'";
                            java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str2);
                         
            while( rs.next())
            {
            i=Integer.parseInt(rs.getString(6));
            i++;
            }
              String str1="Update bankinfo set employee=? where liquid='5crore'";
              PreparedStatement ps=con1.prepareStatement(str1);
              ps.setString(1,i.toString());
              ps.executeUpdate();
              con1.close();
         }
         catch(Exception e)
         {
             
         }
        
      return EMPINSERT;
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

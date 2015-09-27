
package emp;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 *
 * @author RANA
 */
public class Clientaccountup extends ActionSupport {
    
    public Clientaccountup() {
    }
    
    
    final static private String CLNTUPDATE="clntupdate";
    final static private String CLNTDELETE="clntdelete";
    
    private String id;
    private String name;
    private String gen;
    private String address;
    private String phone;
    private String email;
    private Date dob;
 private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDor() {
        return dor;
    }

    public void setDor(Date dor) {
        this.dor = dor;
    }
    private Date dor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        out=1;
       try{    

             Class.forName("oracle.jdbc.driver.OracleDriver");
             /*Establish a connection with a data source*/
             Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
             String str1="Update clients set c_name=?,c_gender=?,c_address=?,c_phone=?,c_email=? where c_id=?";
             PreparedStatement ps=con1.prepareStatement(str1);
             
             ps.setString(1,name);
             ps.setString(2,gen);
             ps.setString(3,address);
             ps.setString(4,phone);
             ps.setString(5,email);
            
             ps.setString(6, id);
             
             ps.executeUpdate();
             con1.close();
         }
          
         catch(Exception e)
            {
                System.out.println(e);    
            }
        
      return CLNTUPDATE;  
    }

    public String delete()
    {
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                            String str1="delete from clients where c_id=?";
                  PreparedStatement ps=con1.prepareStatement(str1);
                   ps.setString(1,id);
                   ps.executeUpdate();
                        con1.close();
        }
        catch(Exception e)
        {
            
        }
        return CLNTDELETE;
    }
    public void validate()
    {
  
   if(getName().length()==0)
         addFieldError("name", "Name is required");
   else if(!getName().matches("^[A-Za-z]{1,30}$"))
     addFieldError("name", "Only alphabets allowed");
     if(getGen().length()==0)
         addFieldError("gen", "Gender is required");
     else if(!getGen().equalsIgnoreCase("male")&&!getGen().equalsIgnoreCase("female"))
         addFieldError("gen","Invalid Detail");
     
     if(getAddress().length()==0)
         addFieldError("address", "Address is required");    
     
    }

}

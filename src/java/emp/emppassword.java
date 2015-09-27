/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class emppassword extends ActionSupport {
    
    public emppassword() {
    }
   private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    private String id;
    private String oldpassword;
int flag=0;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String password;
    private String confirmpassword;

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  
    
    public String execute() throws Exception {
          out=1;
           
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
                           String str="SELECT * FROM  EMPLOYEE ";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                           while(rs.next())
                           {
                            if(id.equals(rs.getString(1))&&
                                oldpassword.equals(rs.getString(2)))   
                            {
	       		  String str1="update employee set e_pass=? where e_id=? ";
                  PreparedStatement ps=con1.prepareStatement(str1);
                         ps.setString(1, password);
                         ps.setString(2,id);
                         ps.executeUpdate();
                            }}
                        con1.close();
                                             
                           
            return SUCCESS;
    }
   
    public void validate(){
		if("".equals(getOldpassword())){
			addFieldError("oldpassword", "Password is required");
                }
              else if(oldpassword.length()!=0)
                {
                  try{ 
                     Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash","yash");
                           String str="SELECT * FROM  EMPLOYEE ";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                           while(rs.next())
                           {
                            if(id.equals(rs.getString(1)))
                                    {
                            if(!oldpassword.equals(rs.getString(2)) )  
                             addFieldError("oldpassword","Old Password did not match");
                            }
                           }
                  con1.close();
                  }
            catch(Exception e)
            {
                System.out.println(e);
            }   
                
	} 
               if("".equals(getPassword())){
			addFieldError("password", "Password is required");
		}
               else if(!getPassword().matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})"))
                    addFieldError("password","Invalid password");
               else if("".equals(getConfirmpassword())){
			addFieldError("confirmpassword", "ConfirmPassword is required");
		}
 
                else if(!(getPassword().equals(getConfirmpassword()))){
			addFieldError("confirmpassword", "Password did not match");
		}
               
    }
}

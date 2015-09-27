/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class login extends ActionSupport {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
private String namedis;

    public String getNamedis() {
        return namedis;
    }

    public void setNamedis(String namedis) {
        this.namedis = namedis;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    public login() {
    }
    
    public String execute() throws Exception {
         Map session = ActionContext.getContext().getSession();
          try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT c_id,c_name FROM  clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(userName))
                    namedis=rs.getString(2);
            }
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
          session.put("namedis",namedis);
          session.put("userName",userName);
          return SUCCESS;
    }
    public void validate(){
       
        if(userName.length()==0)
          addFieldError("userName", "Please enter username!");
      if(password.length()==0)
          addFieldError("password", "Please enter password!");
      if(userName.length()!=0&&password.length()!=0)
      {          
            try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(userName)&&rs.getString(2).equals(password))
                    flag=1;
            }
            if(flag==0)
                addFieldError("userName","Invalid username or password");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
      } 
      
}

}

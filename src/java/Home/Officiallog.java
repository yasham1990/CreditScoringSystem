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
public class Officiallog extends ActionSupport {
    
    public Officiallog() {
    }
    final static private String ADMIN="admin";
    final static private String MANAGER="manager";
    final static private String EMPLOYEE="employee";
     
      private String userName;
       private String namedis;

    public String getNamedis() {
        return namedis;
    }

    public void setNamedis(String namedis) {
        this.namedis = namedis;
    }
private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
  private String official="";

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }
  



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
   
   

    public void validate(){
        
         if(official.length()==0)
          addFieldError("official", "Please enter username!");
        if(userName.length()==0)
          addFieldError("userName", "Please enter username!");
      if(pass.length()==0)
          addFieldError("pass", "Please enter password!");

      if(userName.length()!=0&&pass.length()!=0)
      {
          if(official.equalsIgnoreCase("Admin"))
            try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  admin";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(userName)&&rs.getString(2).equals(pass))
                    flag=1;
            }
            if(flag==0)
                addFieldError("userName","Invalid username or password");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
           if(official.equalsIgnoreCase("Manager"))
            try
             { int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  manager";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(userName)&&rs.getString(2).equals(pass))
                    flag=1;
            }
            if(flag==0)
                addFieldError("userName","Invalid username or password");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
            if(official.equalsIgnoreCase("Employee"))
            try
             { int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  employee";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(rs.getString(1).equals(userName)&&rs.getString(2).equals(pass))
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
    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
      if(official.equalsIgnoreCase("Admin"))
      {
session.put("userName",userName);
       return ADMIN;
      }
      else if(official.equalsIgnoreCase("Manager"))
      {
          try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT m_id,m_name FROM  manager";
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
      
       return MANAGER;}
      else{
           try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT e_id,e_name FROM  employee";
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
      
         
       return EMPLOYEE;
    }
    }
}

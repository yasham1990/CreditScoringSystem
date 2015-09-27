/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author yasham
 */
public class Managerinsert extends ActionSupport {
    
    public Managerinsert() {
    }
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    final static private String MANAGEINSERT="manageinsert";
    public String execute()  {
        
     try{ 
         Integer i=10001,j=0;
     String a;
              Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select e_id from employee";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                           if(rs.isBeforeFirst()==false)
                           {
                            id="E10001";   
                           }else{
                         while(rs.next())
                         {
                             a=rs.getString(1);
                             id=a.substring(1);
                             j=Integer.parseInt(id);
                             if(i<j)
                             {
                               i=j;  
                             }
                         }
                          i++;
                         id="E"+i.toString();
                           }
      con1.close();
         }
          
            catch(Exception e)
            {
                
            }
     return MANAGEINSERT;
    
    }
}

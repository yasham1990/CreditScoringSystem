/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author yasham
 */
public class Admininsert extends ActionSupport {
    
    public Admininsert() {
    }
    
  private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    final static private String ADMININSERT="admininsert";
    public String execute()  {
        
     try{ 
         Integer i=10001,j=0;
     String a;
              Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select m_id from manager";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                           if(rs.isBeforeFirst()==false)
                           {
                            id="M10001";   
                            
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
                         id="M"+i.toString();
                           }
      con1.close();
         }
          
            catch(Exception e)
            {
                
            }
     return ADMININSERT;
    
    }

}

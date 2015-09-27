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
import java.sql.ResultSetMetaData;
import java.util.*;



public class Clickme extends ActionSupport {
     
final static private String PASSWORDBACKMAN="passwordbackman"; 
 final static private String BACK="back"; 
final static private String PASSVIEWMAN="passviewman";
final static private String MANAGEREDITVIEW="managereditview";
final static private String EDITVIEWBACK="editviewback";
final static private String MANAGEINSERTBACK="manageinsertback";
final static private String EMPUPBACK="empupback";
final static private String GOBACK="goback"; 
private List<String> h1;
private String check;
private String id;
private String namedis;

    public String getNamedis() {
        return namedis;
    }

    public void setNamedis(String namedis) {
        this.namedis = namedis;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }
private List<String> h2;

    public List<String> getH2() {
        return h2;
    }

    public void setH2(List<String> h2) {
        this.h2 = h2;
    }

   

  

    public Clickme() {
    }
    
    public String execute() throws Exception {
        String a;
       try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  managerappid order by app_no";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            h1=new ArrayList<String>();
          if(rs.isBeforeFirst()==false)
     {
         check="There is no application request pending";
     }else{                  
               while( rs.next())
    {
       a=rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3); 
   h1.add(a);
    }
        }
          con1.close();
       }
        catch(Exception e)
        {
            
        }
       Map session = ActionContext.getContext().getSession();
       session.put("h1",h1);
       return SUCCESS;
    }

 
 public String passviewman(){
    
       Map session = ActionContext.getContext().getSession();
        id=(String)session.get("userName");
     return PASSVIEWMAN;
 }
 public String passwordbackman(){
     Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
     return PASSWORDBACKMAN;
 }
 public String managereditview()
 {
     String b;
      try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  employee order by e_id";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            h2=new ArrayList<String>();
                           
               while( rs.next())
    {
       b=rs.getString(1)+"--"+rs.getString(3); 
   h2.add(b);
    }
        }
        catch(Exception e)
        {
            
            
        }
       Map session = ActionContext.getContext().getSession();
                session.put("h2",h2);
     return MANAGEREDITVIEW;
 }
 public String back(){
     Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
    return BACK;
 }
  public String goback(){
      Map session = ActionContext.getContext().getSession();
      namedis=(String)session.get("namedis");
    return GOBACK;
 }
 public String editviewback(){
     Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
    return EDITVIEWBACK;
 }
 public String manageinsertback(){
     Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
    return MANAGEINSERTBACK;
 }
   public String empupback()
    {
        Map session = ActionContext.getContext().getSession();
        namedis=(String)session.get("namedis");
        return EMPUPBACK;
    }
}

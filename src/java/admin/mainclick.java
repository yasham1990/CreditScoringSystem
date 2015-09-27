
package admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class mainclick extends ActionSupport {
    final static private String APPREQUESTBACK="apprequestback";
    final static private String ADMINEDITBACK="admineditback";
     final static private String ADMININSERTBACK="admininsertback";
    final static private String ADMINAPPROVEPHOTO="adminapprovephoto";
    final static private String MANAGEPHOTO="managephoto";
    final static private String MNGBACK="mngback";
    final static private String GOBACKADMIN="gobackadmin";
    private List<String> h1; 
    private String check;

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
private List<String> h2;

    public List<String> getH2() {
        return h2;
    }

    public void setH2(List<String> h2) {
        this.h2 = h2;
    }

    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }


    public mainclick() {
    }
    
    public String execute() throws Exception {
      return SUCCESS;
    }
    public String adminapprovephoto()
            {
                String a="";
               try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  adminappreq order by app_no";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            h1=new ArrayList<String>();
         if(rs.isBeforeFirst()==false)
     {
         check="There is no application request pending";
         
     }
         else{                   
               while( rs.next())
    {
        a=rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4); 
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
                return ADMINAPPROVEPHOTO;
            }
     public String managephoto()
            {
                String b;
               try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  manager order by m_id";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            h2=new ArrayList<String>();
                    
               while( rs.next())
    {
       b=rs.getString(1)+"--"+rs.getString(3); 
   h2.add(b);
    }
               con1.close();
        }
        catch(Exception e)
        {
        } 
                Map session = ActionContext.getContext().getSession();
                session.put("h2",h2);
                return MANAGEPHOTO;
            }
     public String admineditback()
             {
                 return ADMINEDITBACK;
             }
      public String admininsertback()
             {
                 return ADMININSERTBACK;
             }
       public String apprequestback()
             {
                 return APPREQUESTBACK;
             }
       public String mngback()
    {
        return MNGBACK;
    }
       public String gobackadmin()
    {
        return GOBACKADMIN;
    }
}

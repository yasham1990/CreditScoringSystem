
package emp;

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
 * @author RANA
 */
public class click extends ActionSupport {
    private List<String> h2;
    private List<String> h1;
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
 private String check;
   final static private String EMPEDITVIEW="empeditview";
   final static private String  EMPEDITBACK="empeditback";
    final static private String EMPEDITVIEWBACK="empeditviewback";
    final static private String PASSVIEW="passview";
    final static private String PASSWORDBACK="passwordback";
    final static private String APPLISTBACK="applistback";
    final static  private  String EXTVERIFYBACK ="extverifyback";
    final static  private  String GOBACKEMP ="gobackemp";
    final static  private  String DEPOSITBACK ="depositback";
    final static  private  String DEPOSIT ="deposit";
    
    public List<String> getH2() {
        return h2;
    }
    
    public click() {
    }
     public String passwordback(){
         Map session = ActionContext.getContext().getSession();
        namedis=(String)session.get("namedis");
        return PASSWORDBACK;
    }
    public String execute() throws Exception {
         String a;
         Map session = ActionContext.getContext().getSession();
      try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  reguser order by app_no";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                            h1=new ArrayList<String>();
            if(rs.isBeforeFirst()==false)
     {
         check="There is no application request pending";
     }else{                 
               while( rs.next())
    {
       a=rs.getString(1)+"--"+rs.getString(3)+"--"+rs.getString(2); 
   h1.add(a);
    }
        }
            con1.close();
      }
        catch(Exception e)
        {
            
            System.out.println(e);    
        }
       session.put("h1",h1);
     return SUCCESS;
        
    }
    public String passview(){
        Map session = ActionContext.getContext().getSession();
        id=(String)session.get("userName");
        return PASSVIEW;
    }
   
     public String empeditview()
 {
      Map session = ActionContext.getContext().getSession();
     String b;
      try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  clients order by c_id";
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
        {}
        session.put("h2",h2);    
            
     return EMPEDITVIEW;
 }
     
     public String empeditviewback(){
          Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
         return EMPEDITVIEWBACK;
     }
      public String empeditback()
    {
         Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
        return EMPEDITBACK;
    } 
       public String applistback(){
    Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
       return APPLISTBACK;
   } 
       public String extverifyback()
        { Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
            return EXTVERIFYBACK;}
        public String gobackemp(){
      Map session = ActionContext.getContext().getSession();
      namedis=(String)session.get("namedis");
    return GOBACKEMP;
 }
         public String depositback(){
      Map session = ActionContext.getContext().getSession();
      namedis=(String)session.get("namedis");
    return DEPOSITBACK;
 }
         public String deposit(){
   
    return DEPOSIT;
}
}
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
import java.sql.Statement;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class appnoinfo extends ActionSupport {
    final static private String APPNOINFO="appnoinfo";
    final static private String VIEWREQINFOBACK="viewreqinfoback";
    public appnoinfo() {
    }
    private List<String> h1;

    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }

  
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String execute() throws Exception {
       Map session = ActionContext.getContext().getSession();
       
        session.put("id",id);
       return APPNOINFO;
    }
    public String viewreqinfoback(){
        return VIEWREQINFOBACK;
        
}
  public void validate()
    {
          Map session = ActionContext.getContext().getSession();
       
        h1=(List<String>)session.get("h1");
        int flag=0;
     if(getId().length()==0)
         addFieldError("id", "Application Id is required");
      if(id.length()!=0)
      {
          String a="";
            try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT app_no FROM  managerappid";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {               
                if(rs.getString(1).equals(getId()))
                   flag=1; 
            }
            if(flag==0)
                addFieldError("id","Invalid application id");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }

    }
}
}

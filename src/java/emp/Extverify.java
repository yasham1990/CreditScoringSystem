
package emp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author RANA
 */
 
public class Extverify extends ActionSupport {
    private String id;
 private List<String> h1;

    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }

      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

      public Extverify() {
    }
    
    @Override
    public String execute() throws Exception {
   
      return SUCCESS;
    }
        
  
    public void validate()
    {
         h1=new ArrayList<String>();
          Map session = ActionContext.getContext().getSession();
        h1=(List<String>)session.get("h1");
     if(getId().length()==0)
         addFieldError("id", "Application Id is required");
      if(id.length()!=0)
      {
        int flag=1;
       
            try
             { Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT app_no FROM  reguser";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {               
                if(rs.getString(1).equals(getId()))
                  flag=0;  
            }
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
            if(flag==1)
          addFieldError("id","Invalid application id");
    }
}
   }


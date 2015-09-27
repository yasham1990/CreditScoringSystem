/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class translist1 extends ActionSupport {
    
    public translist1() {
    }
     private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   private String transdate;
   private List<String> h1;
private List<String> h2;

    public List<String> getH2() {
        return h2;
    }

    public void setH2(List<String> h2) {
        this.h2 = h2;
    }

    public List<String> getH3() {
        return h3;
    }

    public void setH3(List<String> h3) {
        this.h3 = h3;
    }
private List<String> h3;
    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate;
    }
    public String execute() throws Exception {
       return SUCCESS;
    }
    public void validate()
    {
        if(transdate.length()==0)
            addFieldError("transdate","error");
         else if(!transdate.toString().matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)"))
           addFieldError("transdate","Please Enter date in correct format");
         
else {
         
          try
             {
                 DateFormat formatter ; 
 java.util.Date date ; 
  formatter = new SimpleDateFormat("dd/MM/yy");
  date = (java.util.Date)formatter.parse(transdate);
             java.sql.Date sqld1=new java.sql.Date(date.getTime());
                 Map session = ActionContext.getContext().getSession();
     id=(String)session.get("userName");
                 int flag=0;
                         Class.forName("oracle.jdbc.driver.OracleDriver");
                        
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select * from transuser order by time asc";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         h1=new ArrayList<String>();
                         h2=new ArrayList<String>();
                         h3=new ArrayList<String>();
            while( rs.next())
            {
                if(rs.getString(1).equals(id)&&rs.getDate(4).equals(sqld1))
                {
                    h1.add(rs.getString(2)+"------------------------"+rs.getTimestamp(4).toString()+"--------"+rs.getString(3));
                 
                    flag=1;
                }
                    if(flag==0)
                        addFieldError("transdate","Wrong date or no logs found");
            }
            con1.close();
             }
             catch(Exception e)
             {
                 
             }}
    }
}

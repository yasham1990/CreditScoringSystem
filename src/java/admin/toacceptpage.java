/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

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
public class toacceptpage extends ActionSupport {
    final static private String TOACCEPT="toaccept";
    public toacceptpage() {
    }
       private String id;
 private String score;
  private String card;
   private String name;
       private List<String> h1;

    public List<String> getH1() {
        return h1;
    }

    public void setH1(List<String> h1) {
        this.h1 = h1;
    }

    public String execute() throws Exception {
        
         try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT * FROM  adminappreq";
	       		  java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         while(rs.next())
                         {
                             if(id.equals(rs.getString(1)))
                             {
                            id=rs.getString(1);
                            name=rs.getString(2);
                            card=rs.getString(3);        
                            score=rs.getString(4);
                             }      
                         }
                         con1.close();
         }
            catch(Exception e)
            {
                
            }
       return TOACCEPT;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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
                           String str="SELECT app_no FROM  adminappreq";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {               
                if(rs.getString(1).equals(getId()))
                   flag=1 ;
            }
            if(flag==0)
                addFieldError("id", "Invalid Application id");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }

    }
}
}
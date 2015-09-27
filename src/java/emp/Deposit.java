package emp;


import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;


public class Deposit extends ActionSupport {
 
    private String clntId;
    private String acNo;
    private String depAmt;
    final static private String DEPOSITCLNT="depositclnt";
    private Integer tot;
 private Integer out;

    public Integer getOut() {
        return out;
    }

    public void setOut(Integer out) {
        this.out = out;
    }
    public Integer getTot() {
        return tot;
    }

    public void setTot(Integer tot) {
        this.tot = tot;
    }
    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public String getClntId() {
        return clntId;
    }

    public void setClntId(String clntId) {
        this.clntId = clntId;
    }

    public String getDepAmt() {
        return depAmt;
    }

    public void setDepAmt(String depAmt) {
        this.depAmt = depAmt;
    }
    
    public Deposit() {
    }
    
   
    
    public String execute() throws Exception {
        out=1;
       try { 
                Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                          String str1="Update clients set totamount=? where c_id=?";
                  PreparedStatement ps=con1.prepareStatement(str1);
                        ps.setString(1,tot.toString());
                        ps.setString(2,clntId);
                        ps.executeUpdate();
                      ps.close();  
                        String str11="insert into transuser(c_id,c_type,c_amount,time) values(?,?,?,sysdate)";
                        ps=con1.prepareStatement(str11);
                        ps.setString(1,clntId);
                        ps.setString(2,"credit");
                        ps.setString(3,depAmt);
                        ps.executeUpdate();
            
            con1.close();
             }
        catch(Exception e)
        {
            
        }
     return SUCCESS;

    }
    
    public void validate()
    {
     if(clntId.length()==0)
         addFieldError("clntId", "Client Id is required");
    
     if(acNo.length()==0)
         addFieldError("acNo", "Account no is required");
  else if(!acNo.matches("^[0-9_-]{1,16}$"))
         addFieldError("acNo", "Account no invalid");
     if(depAmt.length()==0)
         addFieldError("depAmt", "Amount is required");
   else if(!depAmt.matches("^[0-9]{1,6}$"))
         addFieldError("depAmt", "Invalid Format or Invalid Amount"); 
      if(clntId.length()!=0&&acNo.length()!=0&&depAmt.length()!=0)
      {      
            try
             { 
                 int flag=0;
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="select c_id,card_no,totamount,card_type from clients";
                          Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
            {
                if(clntId.equals(rs.getString(1)))
                {
                if(!rs.getString(2).equals(acNo))
                    flag=1;
                
                if(rs.getString(4).equalsIgnoreCase("Silver")){
                if((Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3)))>25000)
                 flag=2;
                else  tot=Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3));
                }
                if(rs.getString(4).equalsIgnoreCase("Gold")){
                if((Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3)))>50000)
                 flag=4;
                else  tot=Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3));
                }
                if(rs.getString(4).equalsIgnoreCase("Platinum")){
                if((Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3)))>100000)
                 flag=5;
                else  tot=Integer.parseInt(depAmt)+Integer.parseInt(rs.getString(3));
                }
               } 
                else {
                    flag=3;
                       
                        }
            }
          if(flag==3)
                addFieldError("clntId","Invalid client id ");
            if(flag==1)
                addFieldError("acNo","Invalid account no");
            if(flag==2)
                addFieldError("depAmt","Total Amount exceeds limit-25000(Silver Card)");
            if(flag==4)
                addFieldError("depAmt","Total Amount exceeds limit-50000(Gold Card)");
            if(flag==5)
                addFieldError("depAmt","Total Amount exceeds limit-100000(Platinum Card)");
            con1.close();
             }
             catch(Exception e)
             {
                 
             }
      }
    }
}

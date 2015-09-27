
package manage;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.util.Map;


 
public class Generate extends ActionSupport {
    final static private String FAILURE="failure";
    final static private String GENERATEBACK="generateback";
    private String id;
    private Integer score=0;
    private Integer totscore=0;
    private String income1;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxpay() {
        return taxpay;
    }

    public void setTaxpay(String taxpay) {
        this.taxpay = taxpay;
    }
    private String taxpay;
    private String billpay;
    private String otherbank;

    public String getBillpay() {
        return billpay;
    }

    public void setBillpay(String billpay) {
        this.billpay = billpay;
    }

    public String getNfd() {
        return nfd;
    }

    public void setNfd(String nfd) {
        this.nfd = nfd;
    }

    public String getOtherbank() {
        return otherbank;
    }

    public void setOtherbank(String otherbank) {
        this.otherbank = otherbank;
    }
    private String nfd;
    private String bankdefault;
    private String loanpaidhome;
 private String loanpaidcar;

    public String getLoanpaidcar() {
        return loanpaidcar;
    }

    public void setLoanpaidcar(String loanpaidcar) {
        this.loanpaidcar = loanpaidcar;
    }

    public String getLoanpaidhome() {
        return loanpaidhome;
    }

    public void setLoanpaidhome(String loanpaidhome) {
        this.loanpaidhome = loanpaidhome;
    }
    public Integer getTotscore() {
        return totscore;
    }

    public void setTotscore(Integer totscore) {
        this.totscore = totscore;
    }
    private String criminalrecord;
    private String lic;
    private String aggland;
    private String otherinc="";
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

       public String getIncome1() {
        return income1;
    }

    public void setIncome1(String income1) {
        this.income1 = income1;
    }


    public Generate() {
    }
    
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
       
        id=(String)session.get("id");
         try{ Class.forName("oracle.jdbc.driver.OracleDriver");
                           /*Establish a connection with a data source*/
                           Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","yash", "yash");
                           String str="SELECT app_no,ex_income,ex_address,ex_tax,ex_billpay,ex_otherbank,ex_nfd,ex_default,ex_hpaid,ex_crime,ex_lic,ex_agland,ex_otherinc,ex_cpaid FROM  extverify1";
	       		   java.sql.Statement stmt=con1.createStatement();
                           ResultSet rs=stmt.executeQuery(str);
                         
            while( rs.next())
    {
    if(id.equals(rs.getString(1)))
    {
        Float income;
        income=Float.valueOf(rs.getString(2));
        if(income>=30000&&income<=70000)
            score+=10;
        else if(income>=70000&&income<=150000)
                {
                score+=20;    
                }
        else
            score+=30;
        totscore+=score;
      income1=score.toString();
      score=0;
      String address1;
      address=rs.getString(3);
      if(address.equalsIgnoreCase("yes"))
          score+=10;
      else
          score=0;
      totscore+=score;
      address=score.toString();
      score=0;
      Integer defaulttax;
        defaulttax=Integer.parseInt(rs.getString(4));
        if(defaulttax==0)
            score+=10;
        else if(defaulttax==1)
                {
                score+=-4;    
                }
        else if(defaulttax==2)
            score+=-6;
        else
            score+=-10;
        totscore+=score;
      taxpay=score.toString();
      score=0;
      String billpay1;
       billpay1=rs.getString(5);
      if(billpay1.equalsIgnoreCase("ontime"))
          score+=10;
      else
          score=-5;
      totscore+=score;
      billpay=score.toString();
      score=0;
        String otherbank1;
      otherbank1=rs.getString(6);
      if(otherbank1.equalsIgnoreCase("yes"))
          score+=10;
      else
          score=0;
      totscore+=score;
      otherbank=score.toString();
      score=0;
       Integer nfd1;
        nfd1=Integer.parseInt(rs.getString(7));
        if(nfd1==0)
            score+=0;
        else if(nfd1==1)
                {
                score+=4;    
                }
        else if(nfd1==2)
            score+=6;
        else
            score+=10;
        totscore+=score;
      nfd=score.toString();
      score=0;
       Integer bankdefault1;
        bankdefault1=Integer.parseInt(rs.getString(8));
        if(bankdefault1==0)
            score+=10;
        else if(bankdefault1==1)
                {
                score+=-4;    
                }
        else if(bankdefault1==2)
            score+=-6;
        else
            score+=-10;
        totscore+=score;
      bankdefault=score.toString();
      score=0;
      String loanpaid1;
      loanpaid1=rs.getString(9);
      if(loanpaid1.equalsIgnoreCase("regular")||loanpaid1.equalsIgnoreCase("NotAvailable"))
          score=0;
      else
          score+=-5;
      totscore+=score;
      loanpaidhome=score.toString();
      score=0;
       String loanpaid2;
      loanpaid2=rs.getString(14);
      if(loanpaid2.equalsIgnoreCase("regular")||loanpaid2.equalsIgnoreCase("NotAvailable"))
          score=0;
      else
          score+=-5;
      totscore+=score;
      loanpaidcar=score.toString();
      score=0;
      String criminalrecord1;
      criminalrecord1=rs.getString(10);
      if(criminalrecord1.equalsIgnoreCase("no"))
          score=0;
      else
          score+=-5;
      totscore+=score;
      criminalrecord=score.toString();
      score=0;
       int lic1;
        lic1=rs.getInt(11);
        if(lic1==0)
            score+=0;
        else if(lic1==1)
                {
                score+=4;    
                }
        else if(lic1==2)
            score+=6;
        else
            score+=10;
        totscore+=score;
      lic=score.toString();
      score=0;
      Float aggland1;
     aggland1=Float.valueOf(rs.getString(12));
     if(aggland1==0)
         score=0;
     else if(aggland1==500)
          score+=10;
      else if(aggland1==1000)
          score+=20;
     else
          score+=30;
      totscore+=score;
      aggland=score.toString();
      score=0;
        String otherinc1;
      otherinc1=rs.getString(13);
      if(loanpaid2.equalsIgnoreCase("yes"))
          score+=10;
      else
          score=0;
      totscore+=score;
      otherinc=score.toString();
      score=0;
      con1.close();
    }         
    }
            con1.close();
      }
        catch(Exception e)
        {
    }
         
         return FAILURE;
    }

    public String getOtherinc() {
        return otherinc;
    }

    public void setOtherinc(String otherinc) {
        this.otherinc = otherinc;
    }

    public String getAggland() {
        return aggland;
    }

    public void setAggland(String aggland) {
        this.aggland = aggland;
    }

    public String getCriminalrecord() {
        return criminalrecord;
    }

    public void setCriminalrecord(String criminalrecord) {
        this.criminalrecord = criminalrecord;
    }

    public String getLic() {
        return lic;
    }

    public void setLic(String lic) {
        this.lic = lic;
    }

    public String getBankdefault() {
        return bankdefault;
    }

    public void setBankdefault(String bankdefault) {
        this.bankdefault = bankdefault;
    }
 public String generateback(){
return GENERATEBACK;
}

}

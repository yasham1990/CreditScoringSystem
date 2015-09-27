
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

public class clientclick extends ActionSupport {
private String namedis;
private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNamedis() {
        return namedis;
    }

    public void setNamedis(String namedis) {
        this.namedis = namedis;
    }
    public clientclick() {
    }
    final static private String CLIENTPASS="clientpass";
    final static private String CLIENTPASSBACK="clientpassback";
    final static private String TRANSREWBACK="transrewback";
    final static private String TRANSLIST="translist";
    final static private String FUNDTRANS="fundtrans";
    final static private String REWARD="reward";
    final static private String REWARDMOVE="rewardmove";
    final static private String BENEFITBACK="benefitback";
    final static private String TRANSLISTBACK="translistback";
    final static private String FUNDTRANSBACK="fundtransback";
   
    public String execute() throws Exception {
        
       return FUNDTRANS;
    }
      public String clientpass(){
        Map session = ActionContext.getContext().getSession();
        id=(String)session.get("userName");
        return CLIENTPASS;
    }
     public String clientpassback(){
         Map session = ActionContext.getContext().getSession();
        namedis=(String)session.get("namedis");
        return CLIENTPASSBACK;
    }
     public String reward()  {
       return REWARD;
    }
      public String translist()  {
       return TRANSLIST;
    }
       public String translistback()  {
            Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
       return TRANSLISTBACK;
    }
        public String transrewback()  {
            Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
       return TRANSREWBACK;
    }
         public String rewardmove()  {
       return REWARDMOVE;
    }
           public String benefitback()  {
               Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
       return BENEFITBACK;
           }
       public String fundtransback()  {
               Map session = ActionContext.getContext().getSession();
     namedis=(String)session.get("namedis");
       return FUNDTRANSBACK;
    
    }
}

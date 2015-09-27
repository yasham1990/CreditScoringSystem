
package client;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;


public class Logoutclient extends ActionSupport {
    
    public Logoutclient() {
    }
    

     private int out=1;

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
    public String execute() throws Exception {
        out=1;
        Map session = ActionContext.getContext().getSession();
        session.remove("userName");
       session.remove("namedis");
       
        return SUCCESS;
    }
    
}

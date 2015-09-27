/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class Adminlogout extends ActionSupport {
    
    public Adminlogout() {
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
        session.remove("h1");
        session.remove("h2");
        return SUCCESS;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author yasham
 */
public class Logout extends ActionSupport {
    
    public Logout() {
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
         session.remove("id");
         session.remove("h2");
         session.remove("h1");
        return SUCCESS;
    }
}

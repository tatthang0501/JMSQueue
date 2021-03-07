/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMSSend;

import JMS.SendMessageBeanLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author tatth
 */
@Named(value = "send")
@SessionScoped
public class SendManagedBean implements Serializable {

    @EJB
    private SendMessageBeanLocal sendMessageBean;
    private String message;
    
    /**
     * Creates a new instance of SendManagedBean
     */
    public SendManagedBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String send(){
        sendMessageBean.sendMessage(message);
        message = "";
        return null;
    }
}

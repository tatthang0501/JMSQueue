/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMS;

import javax.ejb.Local;

/**
 *
 * @author tatth
 */
@Local
public interface SendMessageBeanLocal {

    public void sendMessage(String message);

}

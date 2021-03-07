/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMS;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author tatth
 */
@Stateless
public class SendMessageBean implements SendMessageBeanLocal {

    @Resource(mappedName = "jms/Test1Queue")
    private Queue test1Queue;

    @Inject
    @JMSConnectionFactory("jms/Test1")
    private JMSContext context;

    private void sendJMSMessageToTest1Queue(String messageData) {
        context.createProducer().send(test1Queue, messageData);
    }
    public void sendMessage(String message){
        sendJMSMessageToTest1Queue(message);
    }
}

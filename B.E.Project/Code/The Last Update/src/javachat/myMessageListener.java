/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javachat;

/**
 *
 * @author Pramod
 */
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;

public class myMessageListener implements MessageListener {
@Override
public void processMessage(Chat chat, Message message) {
    String from = message.getFrom();
    String body = message.getBody();
   // ShowMsg(String from,String body);
}
}
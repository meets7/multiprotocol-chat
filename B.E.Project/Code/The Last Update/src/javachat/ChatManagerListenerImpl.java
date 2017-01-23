/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javachat;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManagerListener;

/**
 *
 * @author Pramod
 */
public class ChatManagerListenerImpl implements ChatManagerListener {
     @Override
        public void chatCreated(Chat chat, boolean createdLocally)
        {
            if (!createdLocally)
                chat.addMessageListener(new myMessageListener());
           // chatWin chatWin1=new chatWin();
        }
}

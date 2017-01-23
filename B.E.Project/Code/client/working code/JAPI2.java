import java.util.*;
import java.io.*;
 
import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

//working but facebook incoming message not displayed
//smack degugger showing message reception

public class JAPI2 implements MessageListener{
 
    XMPPConnection connection;
 
    public void login(String userName, String password) 
    {
    ConnectionConfiguration config = new ConnectionConfiguration("chat.facebook.com",5222, "Work");
    connection = new XMPPConnection(config);
 
    try
	{
		connection.connect();
		connection.login("meet.sangvikar", "");
	} catch (XMPPException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    }
 
    public void sendMessage(String message, String to) 
    {
    Chat chat = connection.getChatManager().createChat(to, this);
    try
	{
		chat.sendMessage(message);
	} catch (XMPPException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
 
    public void displayBuddyList()
    {
    Roster roster = connection.getRoster();
    Collection<RosterEntry> entries = roster.getEntries();
 
    for(RosterEntry r:entries)
    {
    System.out.println(r.getName()+r.getUser());
    }
    }
 
    public void disconnect()
    {
    connection.disconnect();
    }
 
    public void processMessage(Chat chat, Message message)
    {
    if(message.getType() == Message.Type.chat)
    System.out.println(chat.getParticipant() + ":" + message.getBody());
    }
 
    public static void main(String args[]) throws IOException, XMPPException
    {
    JabberSmackAPI c = new JabberSmackAPI();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String msg;
 
 
    //debugger
    XMPPConnection.DEBUG_ENABLED = true;
 
    //accept from userr 
 //c.login(username,passwd);
 
    c.displayBuddyList();
 
    System.out.println("-----");
 
    System.out.println("Type jid:");
    String talkTo = br.readLine();
    System.out.println("-----");
    System.out.println("Enter your message:");
    System.out.println("\n");
 
    while( !(msg=br.readLine()).equals("bye"))
    {
        c.sendMessage(msg, talkTo);
    }
 
    c.disconnect();
    System.exit(0);
    }
}
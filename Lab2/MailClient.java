/**
 * Creating a server to send and receive mail
 * 
 * @author (Caden)
 * @version (CSC 210-01)
 */

public class MailClient
{
    private MailServer server;
    private string user;

    public MailClient (MailServer server, String user)
    {
        this.server = server;
        this.user = user;    
    }

    public MailItem getNextMailItem()
    {
        return server.getNextMailItem();
    }

    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem();
        if (item == null)
        {
            System.out.println("No new mail.");
        }
        else
        {
            item.print();
        }
    }

    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(message);


    }
}
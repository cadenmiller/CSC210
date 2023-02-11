public class MailItem
{
    private String from;
    private String to;
    private String message;

    private MailItem(String from, String to, String message)
    {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public String getFrom()
    {
        return from;
    }

    public String getTo()
    {
        return to;
    }

    public String getMessage()
    {
        return message; 
    }

    public void print()
    {
        System.out.println("From: " + from, ", To: " + to +", Message: " + message);
    }

    
}
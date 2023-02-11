
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MailServer
{

    private List<MailItem> items;

    public MailServer()
    {  
        items = new ArrayList<MailItem>();
    }

    public int howManyMailItems(String who)
    {
        int count = 0;
        for (MailItem item : items)
        {
            if (item.getTo().equals(who))
            {
                count++;
            }
        }
        return count;
    }

    public MailItem getNextMailItem(String who)
    {
        Iterator<MailItem> it = items.iterator();
        while(it.haxNext())
        {
            if (it.getTo().equals(who))
            {
                it.remove();
                return item;
            }
        }
    }

    public void post(MailItem item)
    {
        items.add(item);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Vector;
public class Testvector
{
    public static void main(String [] args)
    {
        List list =new Vector();
        list.add("lekhana");
        list.add("sobham");
        list.add("sourab");
        list.add("vihar");
        list.add("vihar");
        
        System.out.println(list.contains("Sourab1"));
        System.out.println(list.indexOf("sourab"));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("Vihar"));
        System.out.println(list.indexOf("vihar"));
        
         iterator it =list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            
        }

    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Hashtable;


public class testhashtable {
	public static void main( String[] args)
	{
		Map map=new Hashtable();
	
		 map.put("five","Amani");
		 map.put("two","Viswa");
		 map.put("three","mamatha");
		 map.put("four","kanna");
		 
		 System.out.println(map.get("three"));
		 System.out.println(map.keySet());
		 System.out.println(map.values());
		 System.out.println(map.entrySet());
		 System.out.println(map.containsKey("five"));
		 System.out.println(map.isEmpty());
		 System.out.println(map.remove ("two"));
		 System.out.println(map.size());
		 System.out.println(map.replace("five","Rajini"));
		 System.out.println(map.entrySet());
		 
		 Iterator it=map.keySet().iterator();
		 while (it.hasNext())
		 {
			 System.out.println(map.get(it.next()));
			 System.out.println(it.next());
			 
		 }
	}

}

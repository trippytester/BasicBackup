package assignmentcol2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CopyMap
{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	     // Create a HashMap
	     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	 
	     //add elements to HashMap
	     hmap.put(1, "AA");
	     hmap.put(2, "AA");
	     hmap.put(3, "CC");
	     hmap.put(4, "DD");
	 
	     // Create another HashMap
	     HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
	 
	     // Adding elements to the recently created HashMap
	     hmap2.put(11, "Hello");
	     hmap2.put(22, "Hi");
	 
	     // Copying one HashMap "hmap" to another HashMap "hmap2"
	     hmap2.putAll(hmap);
	 
	     // Displaying HashMap "hmap2" content
	     System.out.println("HashMap 2 contains: "+ hmap2);
	     
	     System.out.println(hmap.containsKey(2));
	     
	     System.out.println(hmap.containsValue("AA"));
	     
	     for(int i=1;i<hmap2.size()-1;i++)
	     {
	    	 System.out.println(hmap2.get(i));
	     }
	     
	     Set<Integer> keys = hmap.keySet();
	     for(Integer key: keys)
	     {
	            System.out.println(key);
	     }
	     
	     Set<Entry<Integer, String>> ent=hmap.entrySet();
	     for(Entry<Integer, String> en:ent)
	     {
	    	 System.out.println(en.getKey()+"  "+en.getValue());
	     }
	     
	     hmap2.clear();
	     System.out.println(hmap2);
	  }
}

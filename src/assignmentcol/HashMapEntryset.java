package assignmentcol;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEntryset {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(10, "Amitabh");
		map.put(20, "Abhishek");
		map.put(30, "Akshay");
		map.put(40, "Pavan");
		
		System.out.println(map);
		
		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println(set);
		
		Set<Integer> set2 = map.keySet();
		System.out.println(set2);
		
		map.clear();
		System.out.println(map);

	}

}
package assignmentcol;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchKey {

	public static void main(String[] args) {

		TreeMap<String, String> map1 = new TreeMap<String, String>();
		map1.put("a", "Pizza");
		map1.put("b", "Cheesy Fries");
		map1.put("d", "Icecream");
		
		System.out.println(map1.containsKey("a"));
		Set<String> set = map1.keySet();
		System.out.println(set);

	}

}

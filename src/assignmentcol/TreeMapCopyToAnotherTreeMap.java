package assignmentcol;

import java.util.TreeMap;

public class TreeMapCopyToAnotherTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> map1 = new TreeMap<String, String>();
		map1.put("a", "Pizza");
		map1.put("b", "Cheesy Fries");
		map1.put("c", "Icecream");
		
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("1", "LAssi");
		map2.put("2", "Redbull");
		
		map2.putAll(map1);
		System.out.println(map1);

	}

}

package assignmentcol;

import java.util.HashMap;

public class CopyToAnotherHashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("1", "amit");
		map1.put("2", "abhishek");
		map1.put("3", "akshay");
		
		HashMap<String, String> map2=new HashMap<String, String>();
		map2.put("4", "manish");
		map2.putAll(map1);
		
		System.out.println(map2);
		
	}

}

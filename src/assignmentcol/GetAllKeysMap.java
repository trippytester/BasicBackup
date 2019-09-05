package assignmentcol;

import java.util.HashMap;
import java.util.Set;

public class GetAllKeysMap {

	public static void main(String[] args) {
		
		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("1", "amit");
		map1.put("2", "abhishek");
		map1.put("3", "akshay");
		System.out.println(map1);
		
		
		Set<String> keys = map1.keySet();
		
		for (String s:map1.keySet())
		{
			System.out.println(s);
		}

	}

}

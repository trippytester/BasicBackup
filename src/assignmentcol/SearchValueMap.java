package assignmentcol;

import java.util.HashMap;

public class SearchValueMap {

	public static void main(String[] args) {

		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("1", "amit");
		map1.put("2", "abhishek");
		map1.put("3", "akshay");
		
		if(map1.containsValue("akshay"))
		{
			System.out.println("yes");
		}

	}

}

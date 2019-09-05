package assignmentcol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GetAllValuesMap {

	public static void main(String[] args) {
		
		Map<String, String> map1=new HashMap<String, String>();
		map1.put("1", "amit");
		map1.put("2", "abhishek");
		map1.put("3", "akshay");
		

		Collection<String> values = map1.values();
		System.out.println(values);

	}

}

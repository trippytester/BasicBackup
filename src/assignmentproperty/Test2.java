package assignmentproperty;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		HashMap<String,String> obj=new HashMap<String, String>();
		obj.put("1", "a");
		obj.put("2", "b");
		obj.put("3", "c");
		
		System.out.println(obj);
		Set<Entry<String, String>> obj2 = obj.entrySet();
		
		System.out.println(obj2);
		
//		PrintStream obj1=null;
//		filter
		

	}

}

package assignmentcol;

import java.util.HashMap;
import java.util.Map;

public class GetParticularValueHashmap {

	public static void main(String[] args) {
		
		 Map<String, String> map = new HashMap<String, String>();
         map.put("1","one");
         map.put("2","two");
         map.put("3","three");
         map.put("4","four");
         
         String particularValue = map.get("2");
         System.out.println(particularValue);
	}

}

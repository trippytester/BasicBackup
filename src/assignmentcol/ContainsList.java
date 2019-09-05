package assignmentcol;

import java.util.ArrayList;
import java.util.List;


public class ContainsList {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		al1.add("first");
		al1.add("second");
		al1.add("third");
		al1.add("fourth");
		List abc = (List)al1;
		
		List list = new ArrayList();
		list.add("first");
		list.add("second");
		
		System.out.println(al1.containsAll(list));
	}

}

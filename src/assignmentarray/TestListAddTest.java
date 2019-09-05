package assignmentarray;

import java.util.ArrayList;

public class TestListAddTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.add("d");
		System.out.println(list);
		list.add(2, "z");
		System.out.println(list);

	}

}

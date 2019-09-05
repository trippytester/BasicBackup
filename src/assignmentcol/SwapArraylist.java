package assignmentcol;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArraylist {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
//		System.out.println(list);
//		
//		String temp=list.get(0);
//		list.add(0, list.get(3));
//		list.add(3,temp);
//		System.out.println(list);
		
		System.out.println(list);
		Collections.swap(list, 0, 3);
		System.out.println(list);

	}

}

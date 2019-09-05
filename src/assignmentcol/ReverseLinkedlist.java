package assignmentcol;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("litchi");
		
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}

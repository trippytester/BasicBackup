package assignmentcol;

import java.util.LinkedList;

public class LastElementLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("litchi");
		
		System.out.println(list.get(list.size()-1));
		System.out.println(list.getLast());

	}

}

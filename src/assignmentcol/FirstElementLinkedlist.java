package assignmentcol;

import java.util.LinkedList;

public class FirstElementLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("litchi");
		
		//System.out.println(list.get(0));
		System.out.println(list.getFirst());

	}

}

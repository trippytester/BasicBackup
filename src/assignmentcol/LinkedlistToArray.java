package assignmentcol;

import java.util.LinkedList;

public class LinkedlistToArray {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("litchi");
		
		String sa[]=list.toArray(new String[list.size()]);
		for(String s:sa)
		{
			System.out.println(s);
		}
		
		String[] abc = list.toArray(new String[3]);
	}

}

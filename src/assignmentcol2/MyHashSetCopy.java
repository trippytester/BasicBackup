package assignmentcol2;

import java.util.LinkedList;

public class MyHashSetCopy 
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
	    list.add("Java");
	    list.add("Cric");
	    list.add("Play");
	    
	    LinkedList<String> list1 = new LinkedList<String>();
	    list1.add("Glass");
	    list1.add("Movie");
	    list1.add("Girl");
	    list1.addAll(list);
	    
	    System.out.println(list1);

	}

}

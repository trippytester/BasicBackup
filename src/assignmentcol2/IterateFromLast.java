package assignmentcol2;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateFromLast 
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
	    list.add("Java");
	    list.add("Cric");
	    list.add("Play");
	    list.add("Watch");
	    list.add("Glass");
	    list.add("Movie");
	    list.add("Girl");
	    
	    Iterator<String> itr= list.descendingIterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}
}

package assignmentcol;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterateLinkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("litchi");
		
		System.out.println(list);
		for(String s:list)
		{
			System.out.print(s+" ");
		}
		
		Iterator dItr=list.descendingIterator();
		while (dItr.hasNext())
		{
			System.out.print(dItr.next()+" ");
		}
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i));
		}
		
		
		

	}

}

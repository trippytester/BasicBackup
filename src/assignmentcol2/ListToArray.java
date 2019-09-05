package assignmentcol2;

import java.util.LinkedList;
import java.util.List;

public class ListToArray 
{
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Effective Java");
		ll.add("Clean Code");
		ll.add("Clean Coder");
		
		String s1[]=ll.toArray(new String[ll.size()]);
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
	}
}

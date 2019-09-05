package assignmentcol2;

import java.util.ArrayList;
import java.util.List;

public class ContainsAllAL
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		List l=new ArrayList<>();
		
		for(int i=0;i<=5;i++)
		{
			al.add(i);
		}
		
		System.out.println(l.containsAll(al));
		System.out.println(al.containsAll(l));
		
	}
}

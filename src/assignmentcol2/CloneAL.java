package assignmentcol2;

import java.util.ArrayList;
import java.util.List;

public class CloneAL 
{
	public static void main(String[] args)
	{
		List l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		ArrayList a=new ArrayList(l);
		System.out.println(a.get(5));
		ArrayList a1= (ArrayList) a.clone();
		System.out.println(a1.get(5));
	}
}

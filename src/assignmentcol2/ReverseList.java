package assignmentcol2;

import java.util.ArrayList;

public class ReverseList
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        
        for(int i=list.size()-1;i>=0;i--)
        {
        	System.out.println(new StringBuffer(list.get(i)).reverse());
        }
     }
}

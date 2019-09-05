package assignmentcol2;
import java.util.LinkedList;

public class ReadFirstEl 
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
	    
	    System.out.println(list.getFirst());
	    System.out.println(list.getLast());
	}
}

package assignmentcol2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MySetSublist 
{
	public static void main(String a[])
	{
        
        TreeSet<String> ts = new TreeSet<String>(new MyStrComp());
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);
    }
}
 
class MyStrComp implements Comparator<String>{
 
    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}

package assignmentcol2;

import java.util.HashSet;

public class CompareSets 
{
	public static void main(String[] args) {
	     
	        HashSet<String> h_set1 = new HashSet<String>();
	     
	          h_set1.add("Red");
	          h_set1.add("Green");
	          h_set1.add("Black");
	          h_set1.add("White");
	          System.out.println("Frist HashSet content: "+h_set1);
	          
	          HashSet<String>h_set2 = new HashSet<String>();
	          h_set2.add("Red");
	          h_set2.add("Pink");
	          h_set2.add("Black");
	          h_set2.add("Orange");
	          System.out.println("Second HashSet content: "+h_set2);
	          
	          h_set1.retainAll(h_set2);
	          
	          System.out.println("HashSet content:");
	          System.out.println(h_set1);
	     }
}

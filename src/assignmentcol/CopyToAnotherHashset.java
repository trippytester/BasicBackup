package assignmentcol;

import java.util.HashSet;

public class CopyToAnotherHashset {

	public static void main(String[] args) {
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("apple");
		set1.add("mango");
		set1.add("litchi");
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("pineapple");
		set2.addAll(set1);
		
		System.out.println(set2);

	}

}

package assignmentcol;

import java.util.HashSet;

public class RetainSet {

	public static void main(String[] args) {
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("cherry");
		System.out.println(set1.add(null));
		System.out.println(set1.add(null));
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("orange");
		set2.add("pine");
		set2.add("apple");
		//set2.retainAll(set1);
		set2.addAll(set1);
		System.out.println(set2);
	}

}

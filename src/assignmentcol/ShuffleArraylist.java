package assignmentcol;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("mango");
		al.add("orange");
		al.add("litchi");
		al.add("pineapple");
		al.add("strawberry");
	    
		System.out.println(al);
		Collections.shuffle(al);
		
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}

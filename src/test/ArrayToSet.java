package test;

import java.util.HashSet;

public class ArrayToSet {

	public static void main(String[] args) {
		
		Integer[] i= {1,2,3,4,5};
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(Integer a:i)
		{
			set.add(a);
		}
		System.out.println(set);
	}

}

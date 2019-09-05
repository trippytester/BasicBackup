package assignmentcol;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetsubSet {

	public static void main(String[] args) {
		
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(9);
		set.add(11);
		
		System.out.println(set.subSet(2, 10));

	}

}

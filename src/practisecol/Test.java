package practisecol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(112);
		al.add("njbkj");
		al.add(112);
		al.add("hskwgduigwu");
		al.add(6286);
		System.out.println("=========================================");
		//al.remove(0);
		//al.add(2, 1234);
		for (Object obj:al)
		{
			System.out.print(obj+" " );
		}
		System.out.println();
		HashSet hs=new HashSet(al);
		for (Object obj:hs)
		{
			System.out.print(obj+" " );
		}
		
		TreeSet<Integer> tr=new TreeSet();
		
		
	}

}

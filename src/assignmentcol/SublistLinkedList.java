package assignmentcol;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SublistLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("abhishek");
		list.add("akshay");
		list.add("amitabh");
		list.add("manish");
		list.add("pavan");
		list.add("praveen");
		
		List<String> sublist = list.subList(2, 5);
		//list.subList(fromIndex, toIndex)
		
//		Iterator it=list.iterator();
//		
//		while (it.hasNext())
//		{
//			it.next();
//		}
		for (String s:sublist)
		{
			System.out.print(s);
		}
	}

}

package assignmentcol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraylistToArrray {


	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);

		//String sa[]=new String[2];
//		String newsa[]=list.toArray(new String[2]);
//		System.out.println(newsa[0]);
//		System.out.println(newsa[1]);
		Integer[] ia = list.toArray(new Integer[2]);
		Integer[] ia2 = ia;
		String s="";
		List<String> list2 = Arrays.asList(s);
		HashSet<String> set=new HashSet<String>(list2);
		HashSet<String> set2=new HashSet<String>(Arrays.asList("a","b"));
	
		System.out.println(set);
		System.out.println(set2);
		
		
		
//		ArrayList list2=new ArrayList();
//		list2.add(1);
//		list2.add(2);
//		Object i[]= list2.toArray();
//        for (Object o:ans)
//		{
//			System.out.print(o+" ");
//		}
//		
		

	}

}

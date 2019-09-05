package test;

import java.util.Arrays;
import java.util.HashSet;

public class SetToArray {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
		//int[] a= new int[5];
		Integer[] b=new Integer[set.size()];
		int k=0;
		for (Integer i:set)
		{
			b[k++]=i;
		}
		Integer c=1;
		String s="";
		for(Integer i:b)
		{
			s=s+Integer.toString(i);
		}
		System.out.println(s);
		
	}

}

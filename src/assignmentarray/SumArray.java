package assignmentarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArray {

	public static void main(String[] args) {
		
		Integer[] a= {1,2,3,4,5};
		int sum=0;
		for (int i=0;i<a.length;i++ )
		{
			sum=sum+a[i];
		}
	    // Integer[] b=a;
		
		List<Integer> b = Arrays.asList(a);
//		ArrayList list =new ArrayList();
//		List<int[]> list2 = Arrays.asList(a);
//		System.out.println(list2);
		
		System.out.println(b);

	}

}

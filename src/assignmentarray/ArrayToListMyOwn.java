package assignmentarray;

import java.util.Arrays;
import java.util.List;

public class ArrayToListMyOwn {
	
	public static List<String> listCreator(String[] a)
	{
		List<String> list = Arrays.asList(a);
		return list;
	}
	

	public static void main(String[] args) {
		
		String[] array= {"I","LOVE","MY","MOM"};
		System.out.println("Array : "+Arrays.toString(array));
		System.out.println("List : " +listCreator(array));
		List<String> obj = Arrays.asList(array);
	    
	}
}

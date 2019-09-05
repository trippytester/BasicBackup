package assignmentarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VariableMarks {
	
	public static int sum(Integer[] array)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		List<Integer> list=Arrays.asList(array);
		int total=0;
		for (int i=0;i<list.size();i++)
		{
			total=total+list.get(i);
		}
		return total;
	}

	public static void main(String[] args) {
		
		Integer[] array=new Integer[5];
		System.out.println(sum(array));
	}

}

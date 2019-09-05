package assignmentcol2;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1= sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		System.out.println(s2);

	}

}

package assignmentcol2;

import java.util.Scanner;

public class Reverse_A_String_with_Algorithm {

	public static void main(String[] args)
	{
		String temp = "" ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1= sc.next();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
				temp=temp + s1.charAt(i);
			
		}
		System.out.println(temp);
	}

}

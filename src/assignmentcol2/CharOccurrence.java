package assignmentcol2;

import java.util.Scanner;

public class CharOccurrence 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=s1.nextLine();
		char []a=str1.toCharArray();
		System.out.println(a);
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]!=' ')
			{
				
				for(int j=i+1;j<a.length;j++)
				{
				
					if(a[i]==a[j] )
					{
						count++;
						a[j]=' ';
					}
				}
				System.out.println(a[i]+" of appearance- " +count);
			}
			
		}
		
	}

}

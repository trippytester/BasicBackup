package assignmentcol2;

import java.util.Scanner;

public class Separate_Reverse_A_String {
	public static void main(String[] args)
	{
		int start=0,end=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				start=i;
				for(int j=i;j<ch.length;j++)
				{
					if((j==ch.length-1 && ch[j]!=' ')||(ch[j]!=' ' && ch[j+1]==' '))
					{
						end=j;
						break;
					}
				}
				if(ch[i]==ch.length-1)
				{
					for(int k=start;k<=end;k++)
					{
						System.out.print(ch[k]);
					}
					System.out.println();
					i=end;
				}
				else
				{
					for(int k=end;k>=start;k--)
					{
						System.out.print(ch[k]);
					}
					System.out.println();
					i=end;
				}
			}
		}
		//System.out.println(ch.length);
	}
}

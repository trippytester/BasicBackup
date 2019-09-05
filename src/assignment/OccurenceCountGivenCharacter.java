package assignment;

import java.util.Scanner;

public class OccurenceCountGivenCharacter {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char c=s.next().charAt(0);
		
		String s1="aaahjkbdhiodjlkhajklhjkdgajlkahdhlkhlahlkhlh";
		char ch[]=s1.toCharArray();
		int count=0;
		
		for (int i=0;i<ch.length;i++)
		{
			if(c==ch[i])
			{
				count++;
			}
		}
		
		System.out.println("no of "+c+" = "+count);

	}

}

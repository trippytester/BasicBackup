package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateWordWise {

	public static void main(String[] args)  
	{	
		String s1="WELCOME TO GOA SINGHAM";
		String sa[]=s1.split(" ");
		List<String> al=new ArrayList();
		al=Arrays.asList(sa);
		
		for (String s:al)
		{
			System.out.print(s+ " ");
		}
		
		//String temp=al.get(0);
		//System.out.println(al.remove(1));
//		al.add(temp);
//		//al.add(3, temp);
//		
//		for (String s:al)
//		{
//			System.out.print(s+" ");
//		}
		
		try
		{
			al.remove(0);
		}
		catch(UnsupportedOperationException u)
		{
			
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i));
		}
		
		
		
		
	}

}

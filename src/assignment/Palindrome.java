package assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		String s1="MALAYALAM";
		char ch[]=s1.toCharArray();
		
		int i,j;
		
		for(i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			if (ch[i]!=ch[j])
			{
				break;
			}
		}
		
		if(i==ch.length/2)
		{
			System.out.println("palindrome");
		}
		
		else 
		{
			System.out.println("not a palindrome");
		}
			

	}

}

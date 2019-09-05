package assignment;

public class RevereseWordWise {

	public static void main(String[] args) {
		
		String s1="I love java programming";
		String sa[]=s1.split(" ");
		String reverse="";
		
		for(int i=sa.length-1;i>=0;i--)
		{
			if (i==sa.length-1)
			{
				reverse=reverse+sa[i];
			}
			else 
			{
			reverse=reverse+" "+sa[i];
			}
		}
		
		System.out.println(reverse);

	}

}

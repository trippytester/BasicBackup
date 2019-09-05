package assignment;

public class RotateWordWise2 {

	public static void main(String[] args) {
		
		String s1="WELCOME TO GOA SINGHAM";
		String [] sa=s1.split(" ");
		
		for (int i=0;i<sa.length-1;i++)
		{
			String temp=sa[i];
			sa[i]=sa[i+1];
			sa[i+1]=temp;
		}
		
		for (int i=0;i<sa.length;i++)
		{
			if (i==sa.length-1)
			{
				System.out.print(sa[i]);
			}
			else {
				System.out.print(sa[i]+" ");	
			}
			
		}
		

	}

}

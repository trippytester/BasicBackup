package patternsir;

public class Test13 {

	public static void main(String[] args) {
		
		String s1="SUNNY";
		
		for (int i=1;i<s1.length()+1;i++)
		{
			String s2="";
			for (int j=1;j<=i;j++)
			{
				System.out.println(s2+s1.substring(0, j));
				
			}
		}

	}

}

package assignment;

public class NoOfWords {

	public static void main(String[] args) {
		
		String s1="  WELCOME  TO  GOA  SINGHAM  ";
		char ch[]=s1.toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if ((ch[i]!=' '&&ch[i+1]==' ')||(ch[i]!=' '&&i==ch.length))
			{
				count++;
			}
		}
		System.out.println("no of words : "+count);

	}

}

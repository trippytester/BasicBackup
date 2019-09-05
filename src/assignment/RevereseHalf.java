package assignment;

public class RevereseHalf {

	public static void main(String[] args) {
		
		String s1="abcdhgfe";
		char ch[]=s1.toCharArray();
		
		for(int i=0,j=ch.length/2-1;i<ch.length/4;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		for(int i=ch.length/2,j=ch.length-1;i<ch.length*3/4;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}

	}

}

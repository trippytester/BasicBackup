package assignment;

public class Reverse {

	public static void main(String[] args) {
		
		String s1= "abcdefghi";
		char ch[]=s1.toCharArray();
		
		//int i,j;
		
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
		//String s2=String.valueOf(ch);
		String s3=new String(ch);
		
		//System.out.println(s2);
		System.out.println(s3);

	}

}

package assignment;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String s1= "WELCOME TO GOA SINGHAM";
		String []sa=s1.split(" ");
		//char ch[]=s1.toCharArray();
		
		//int i,j;
		String reverse="";
		
		for (int k=0;k<sa.length;k++)
		{
			char ch[]=sa[k].toCharArray();
	    	for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		    {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		    }
	    	if (k==0)
	    	{
	    		reverse=reverse+String.valueOf(ch);
	    		//reverse=String.valueOf(ch)+reverse;
	    	}
	    	else {
	    	reverse= reverse+" " +String.valueOf(ch);
	    		//reverse=String.valueOf(ch)+" "+reverse;
	    	}
	    	
		}
		System.out.println(reverse);
		
		//String s2=String.valueOf(ch);
	//	String s3=new String(ch);
		
		//System.out.println(s2);
		//System.out.println(s3);


	}

}

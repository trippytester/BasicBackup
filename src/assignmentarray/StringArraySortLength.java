package assignmentarray;

public class StringArraySortLength {

	public static void main(String[] args) {
		
		String[] s= {"I","LOVE","MY","MOM","VERY","MUCH"};
		for(int i=0;i<s.length-1;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if (s[i].length()==s[j].length())
				{
					int compare = s[i].compareTo(s[j]);
					if(compare>=1)
					{
						String temp1=s[i];
						s[i]=s[j];
						s[j]=temp1;
					}
					
				}
				
				else
				{
				   if(s[i].length()>s[j].length())
				   {
					 String temp=s[i];
					 s[i]=s[j];
					 s[j]=temp;
				   }
				}
			}
				
			}
			
		
        for(int i=0;i<s.length;i++)
        	System.out.println(s[i]);
	
	}

}

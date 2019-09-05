package assignment;

public class OccurenceCount {

	public static void main(String[] args) {
		
		String s1="aabdjbjbbjahhhdghbjagdgsjb";
		char ch[]=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(ch[i]!=' ')
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						ch[j]=' ';
						count++;
					}
				}
				System.out.println("no of "+ch[i]+"= "+count);
			}
		}
		

	}

}

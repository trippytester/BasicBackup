package assignment;

public class DuplicateCount {

	public static void main(String[] args) {
		
		String s1="big black dog bites big big big black mouth is a funny funny bites funny";
		String sa[]=s1.split(" ");
		
		for(int i=0;i<sa.length;i++)
		{
			int count=1;
			for (int j=i+1;j<sa.length;j++)
			{
				if (sa[i].equals(sa[j]))
				{
					count++;
					sa[j]="0";
				}
				
			}
			if (count>1&&sa[i]!="0")
			{
				System.out.print(sa[i]+" = "+count+" times, ");
			}
			
				
		}

	}

}

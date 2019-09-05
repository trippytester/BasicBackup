package practisepattern;

import java.sql.Driver;

public class Test7 {

	public static void main(String[] args) {
		
		int k=0;
		for(int i=1;i<=4;i++)
		{
		    k=k+i;
			for (int j=1;j<=i;j++)
			{
				System.out.print(k--);
			}
			 k=k+i;
			System.out.println();
		}

	}

}

package patternsir;

public class Test11 {

	public static void main(String[] args) {

		int k=10;
		int row=4;
		
		for (int i=1;i<=4;i++)
		{
			for (int l=row-1;l>=i;l--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(k-- +" ");
			}
			System.out.println();
		}

	}

}

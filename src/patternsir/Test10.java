package patternsir;

public class Test10 {

	public static void main(String[] args) {

		int k=10;
		//int row=4;
		
		for (int i=1;i<=4;i++)
		{
			for (int l=1;l<i;l++)
			{
				System.out.print(" ");
			}
			for (int j=4;j>=i;j--)
			{
				System.out.print(k-- +" ");
			}
			System.out.println();
		}

	}

}

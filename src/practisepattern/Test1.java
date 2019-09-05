package practisepattern;

public class Test1 {

	public static void main(String[] args) {
		
		int k=10;
		for (int i=1;i<=4;i++ )
		{
			for (int l=3;l>=i;l--)
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

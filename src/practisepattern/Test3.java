package practisepattern;

public class Test3 {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for (int l=1;l<i;l++)
			{
				System.out.print(" ");
			}
			for (int j=4;j>=i;j--)
			{
				System.out.print(k++);
			}
			System.out.println();
		}

	}

}

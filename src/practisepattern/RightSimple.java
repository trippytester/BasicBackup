package practisepattern;

public class RightSimple {

	public static void main(String[] args) {

		
		for (int i=0;i<4;i++)
		{
			int k=1;
			for (int j=0;j<4;j++)
			{
				if (i>=j)
				{
					System.out.print(k++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

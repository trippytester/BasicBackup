package assignmentarray;

public class Test2 {

	
	public static String[] run(String s,String s1)
	{
		String [] s2= new String[2];
		
		s2[0]=s;
		s2[1]=s1;
		
//		System.out.println(s2[0]);
//		System.out.println(s2[1]);
		
		return s2;
	}
	public static void main(String[] args)
	{
		String[] s3=run("praveen","kumar");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
	}
}

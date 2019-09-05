package practisecol;

class Test3 
{ 
	public static void main(String args[]) 
	{ 
		Test2 s = new Test2("ABC", 101); 
		Test2 s1 = new Test2("ABCDEF", 102);
		System.out.println(s.getName()); 
		System.out.println(s.getRegNo());
		System.out.println(s1.getName()); 
		System.out.println(s1.getRegNo());
		s1.name="ramesh";
		

		// Uncommenting below line causes error 
		// s.regNo = 102; 
	} 
} 

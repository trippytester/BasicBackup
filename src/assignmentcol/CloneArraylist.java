package assignmentcol;

import java.util.ArrayList;
import java.util.LinkedList;

public class CloneArraylist {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		al1.add(2777);
		al1.add(254);
		al1.add(45);
		al1.add(671);
		
		ArrayList al2=new ArrayList(al1);
		
		System.out.println("original arraylist : "+al1);
		System.out.println("copied array : "+al2);
		
		ArrayList al3 = (ArrayList) al1.clone();
		 ArrayList al4 = (ArrayList) al1.clone();

	}

}

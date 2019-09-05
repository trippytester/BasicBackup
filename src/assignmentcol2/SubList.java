package assignmentcol2;

import java.util.LinkedList;

public class SubList 
{
	public static void main(String[] args) {
		  
	    LinkedList<String> linkedList = new LinkedList<String>();
	    linkedList.add("element_1");
	    linkedList.add("element_2");
	    linkedList.add("element_3");
	    linkedList.add("element_4");
	    linkedList.add("element_5");
	  
	    System.out.println("LinkedList contains : " + linkedList);
	 
	   
	    LinkedList<String> subList =(LinkedList<String>) linkedList.subList(1,3);
	    System.out.println("subList contains : " + subList);
	  
	  
	}
}
	   

package assignmentcol2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleL 
{
	 public static void main(String a[]){
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Java");
	        list.add("Cric");
	        list.add("Play");
	        list.add("Watch");
	        list.add("Glass");
	        list.add("Movie");
	        list.add("Girl");
	         
	        Collections.shuffle(list);
	        System.out.println("Results after shuffle operation:");
	        for(String str: list){
	            System.out.println(str);
	        }
	    }
}

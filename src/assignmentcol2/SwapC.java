package assignmentcol2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapC
{
	public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        
        System.out.println(list);
        
        Collections.swap(list, 1, 2);
        
        System.out.println(list);
	}
}

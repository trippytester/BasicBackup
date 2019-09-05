package assignmentcol2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SyncronizeArrayList
{
	public static void main(String a[])
	{
        
        List<String> li = new ArrayList<String>();
        List<String> sysLi = Collections.synchronizedList(li);
        System.out.println("Synchronized list got created...");
    } 
        
}


package assignmentarray;

import java.util.Arrays;

class ObjectArrayToIntegerArray {

	// Program to convert Object array to Integer array in Java
	public static void main(String args[])
	{
		Object[] objectArray = { 1, 2, 3, 4, 5 };

		Integer[] integerArray = new Integer[objectArray.length];

//		// copy elements from object array to integer array
//		for (int i = 0; i < objectArray.length; i++)
//			integerArray[i] = (Integer)objectArray[i];
//
//		System.out.println(Arrays.toString(integerArray));
		
		int newly = (Integer)objectArray[0];
	}
}
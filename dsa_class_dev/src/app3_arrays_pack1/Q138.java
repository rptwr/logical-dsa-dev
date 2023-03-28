package app3_arrays_pack1;

/*
 *  Print number and its double if exists in the array
 * */


public class Q138  {
	public static void main(String[] args) 
	{
		int[] elements = {1, 3, 7, 4, 2, 6, 10, 8, 10};
		int element;
		for (int i = 0; i < elements.length; i++) 
		{
			element = elements[i];
			for (int j = 0; j < elements.length; j++) 
			{
				if (2 * element == elements[j]) 
				{
					System.out.println(element + " at index: " + i + " & its double: " + elements[j] + " at index: " + j);
				}
			}
		}
	}
}
package app3_arrays_pack1;
/*
adding new element(12) at the begining
*/
import java.util.Arrays;
class Q66 
{
	public static void main(String[] args) 
	{
		int[] elements = {5, 14, 2, 4, 8, 7, 20, 10, 15, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int[] temp = elements;
		elements = new int[temp.length + 1];
	    elements[0] = 12;
		for(int i = 0; i < temp.length; i++)
		{
			elements[i + 1] = temp[i];
		}
	
		System.out.println("final:" + Arrays.toString(elements));
	}
}

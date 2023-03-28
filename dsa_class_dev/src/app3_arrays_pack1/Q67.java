package app3_arrays_pack1;
/*
adding new element(12) at the middile
*/
import java.util.Arrays;
class Q67
{
	public static void main(String[] args) 
	{
		int[] elements = {5, 14, 2, 4, 8, 7, 20, 10, 15, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int[] temp = elements;
		elements = new int[temp.length + 1];
		elements[elements.length / 2] = 12; 
		for(int i = 0; i < temp.length / 2; i++)
		{
			elements[i] = temp[i];
			elements[(elements.length / 2) + i + 1] = temp[(elements.length / 2) + i];
		}

	
		System.out.println("final:" + Arrays.toString(elements));
	}
} 
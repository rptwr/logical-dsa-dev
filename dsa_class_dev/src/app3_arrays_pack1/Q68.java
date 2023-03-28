package app3_arrays_pack1;
/*
through cla receive two int number 
one is a value and other is index location 
*/
import java.util.Arrays;
class Q68
{
	public static void main(String[] args) 
	{
		int[] elements = {5, 14, 2, 4, 8, 7, 20, 10, 15, 18};
		System.out.println("initial:" + Arrays.toString(elements));
		int value = Integer.parseInt(args[0]);
		int location = Integer.parseInt(args[1]);
		int[] temp = elements;
		elements = new int[temp.length + 1];
		
		for(int i = 0; i < temp.length; i++)
		{
			elements[i] = temp[i];
		}
		for(int i = elements.length - 1; i > elements.length / 2; i--)
		{
			elements[i] = elements[i -1];
		}

	
		System.out.println("final:" + Arrays.toString(elements));
	}
}

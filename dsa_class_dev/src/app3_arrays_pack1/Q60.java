package app3_arrays_pack1;
/*
swap odd index elements with the even index elements
4, 10, 14, 20, 199, 90, 3, 70
*/
/*
import java.util.Arrays;
class Q60
{
	public static void main(String[] args)
	{
		int[] elements = {10, 4, 20, 14, 90, 199, 70, 3};
		              //   0  1   2   3  4   5    6   7   
		System.out.println("iniital content:" + Arrays.toString(elements));
		int temp;
		for(int i = 0; i < elements.length; i += 2)
		for(int j = 1; j < elements.length; j += 2)
			{
			    temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
			}
		System.out.println("final content:" + Arrays.toString(elements));
	}
}

*/

import java.util.Arrays;
class Q60
{
	public static void main(String[] args)
	{
		int[] elements = {10, 4, 20, 14, 90, 199, 70, 3};
		              //   0  1   2   3  4   5    6   7   
		System.out.println("iniital content:" + Arrays.toString(elements));
		int temp;
		for(int i = 0; i < elements.length - 1; i += 2)
			{
			    temp = elements[i];
                elements[i] = elements[i + 1];
                elements[i + 1] = temp;
			}
		System.out.println("final content:" + Arrays.toString(elements));
	}
}

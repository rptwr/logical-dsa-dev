package app3_arrays_pack1;
///*
//right shift by 2
//*/
//
//import java.util.Arrays;
//class Q71
//{
//	public static void main(String[] args) 
//	{
//		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
//		System.out.println("initial:" + Arrays.toString(elements));
//		for(int i = elements.length - 1; i > 1; i--)
//		{
//			elements[i] = elements[i - 2];
//		}
//		System.out.println("final:" + Arrays.toString(elements));
//	}
//}
/*
right rotate by 2
*/

import java.util.Arrays;
class Q71
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("initial:" + Arrays.toString(elements));
		int temp1 = elements[elements.length - 1];
		int temp2 = elements[elements.length - 2];
		for(int i = elements.length - 1; i > 1; i--)
		{
			elements[i] = elements[i - 2];
		}
		elements[0] = temp2;
		elements[1] = temp1;
		System.out.println("final:" + Arrays.toString(elements));
	}
}
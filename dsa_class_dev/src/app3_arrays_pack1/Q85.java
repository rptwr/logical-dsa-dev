package app3_arrays_pack1;
/*
selection short
[10, 2, 12, 6, 0, 5, 4, 8]
select minimum element
[0, 2, 12, 6, 10, 5, 4, 8]
    ^
[0, 2, 12, 6, 10, 5, 4, 8]
                     ^
[0, 2, 4, 6, 10, 5, 12, 8]
                 ^ 
[0, 2, 4, 5, 10, 6, 12, 8]
                 ^
[0, 2, 4, 5, 6, 10, 12, 8]
                        ^
[0, 2, 4, 5, 6, 10, 12, 8]
                        ^
[0, 2, 4, 5, 6, 8, 12, 10]
                        ^
[0, 2, 4, 5, 6, 8, 10, 12]
                        ^

*/

//import java.util.Arrays;
//class Q85
//{
//	public static void main(String[] args) 
//	{
//		int[] a1 = {2, 5, 3, 7, 10, 15, 4, 1, -2};
//
//		for(int i = 0; i < a1.length; i++)
//		{
//			int min_index = i;
//			for(int j = 0; j < a1.length; j++)
//			{
//				if(a1[j] > a1[min_index])
//				{
//					min_index = j;
//					int temp = a1[min_index];
//					a1[min_index] = a1[i];
//					a1[i] = temp;
//				}
//			}
//		 System.out.println(Arrays.toString(a1));
//		}
//		System.out.println(Arrays.toString(a1));
//	} 
//}

import java.util.Arrays;
class Q85
{
	public static void main(String[] args) 
	{
		int[] a1 = {2, 5, 3, 7, 10, 15, 4, 1, -2};
		
		int minIndex, minValue;
		for(int i = 0; i < a1.length; i++)
		{
			minValue = a1[i];
			minIndex = i;
			for(int j = i + 1; j < a1.length; j++)
			{
				if(a1[j] < minValue)
				{
					minValue = a1[j];
					minIndex = j;
				}
			}
			int temp = a1[i];
			a1[i] = a1[minIndex];
			a1[minIndex] = temp;

			System.out.println(Arrays.toString(a1));
		}
		System.out.println(Arrays.toString(a1));
	} 
}



























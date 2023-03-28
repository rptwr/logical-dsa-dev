package app3_arrays_pack1;
/*
insert a2 elements in the a1 from 4th location onwards
{10, 20, 30, 1, 201, 29, 43, 40, 50, 60, 70, 80};
*/

//import java.util.Arrays;
//class Q80
//{
//	public static void main(String[] args) 
//	{
//		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80};
//		//           0   1   2   3   4   5   6   7
//		int[] a2 = {1, 201, 29, 43};
//		int[] t1 = a1;
//		a1 = new int[t1.length + a2.length];
//		for(int i = 0; i < t1.length; i++)
//		{
//			a1[i] = t1[i];
//		}
//		for(int i = a1.length - 1; i > (2 + a2.length) ; i--)
//		{
//			a1[i] = a1[i - a2.length];  // right shift by 4 till to i value 3
//		}
//		for(int i = 0; i < a2.length; i++)
//		{
//			a1[i + 3] = a2[i];
//		}
//		//System.out.println(Arrays.toString(a2));
//		System.out.println(Arrays.toString(a1));
//	}
//}



/*
insert a2 elements in the a1 from 4th location onwards
{10, 20, 30, 1, 201, 29, 43, 40, 50, 60, 70, 80};
*/

import java.util.Arrays;
class Q80
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 60, 70, 80};
		//           0   1   2   3   4   5   6   7
		int[] a2 = {1, 201, 29, 43};
		
		int[] t1 = a1;
		a1 = new int[t1.length + a2.length];
		for(int i = 0; i < t1.length; i++)
		{
			a1[i] = t1[i];
		}
		for(int i = a1.length - 1; i > 4; i--)
		{
			a1[i] = a1[i - 4];
		}
		for(int i = 0; i < a2.length; i++)
		{
			a1[i + 3] = a2[i]; 
		}
		System.out.println(Arrays.toString(a1));
	} 
}

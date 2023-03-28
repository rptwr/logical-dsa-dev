package app3_arrays_pack1;

/*
Add two array elements into 3rd array by considering elements are both  array one by one
*/
import java.util.Arrays;
class Q107
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 4, 6, 9, 100, 1, 6};
		int[] a2 = {101, 201, 301, 401, 501};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		int[] a3 = new int[a1.length + a2.length];
		int maxSize = a1.length > a2.length ? a1.length : a2.length;
		for(int i = 0, j = 0; i < maxSize; i++)
		{
			if(i < a1.length)
			{
				a3[j++] = a1[i]; 
			}
			if(i < a2.length)
			{
				a3[j++] = a2[i];
			}
		}
		System.out.println(Arrays.toString(a3));
	}
}

package app3_arrays_pack1;
/*
two given arrays are equal or not
*/
import java.util.Arrays;
class T5
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println("common elements:");
		boolean equals = test(a1, a2);
		System.out.println(equals);
	}
	static boolean test(int[] a1, int[] a2)
	{
		boolean equals = true;
		if(a1.length != a2.length)
		{
			return false;
		}
		for(int i = 0; i < a1.length; i++)
		{
			if(a1[i] != a2[i])
			{
				equals = false;
				break;
			}
		}
		return equals;
	}
}


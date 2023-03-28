package app3_arrays_pack1;

/*
print all even element at left side and all odd elements at rigth side
*/
import java.util.Arrays;
class Q112
{
	public static void main(String[] args) 
	{
		int[] a = {10, 5, 3, 40, 11, 50, 7, 12, 4, 9};
		      //     0  1  2   3   4  5   6  7  8   9
		//System.out.println(Arrays.toString(a1));
		for(int i = 0, n = 0; i < a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				int temp = a[i];
				a[i] = a[n];
				a[n] = temp;
				n++;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}


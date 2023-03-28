package app3_arrays_pack1;

/*
move all even left side odd right side
*/
import java.util.Arrays;
class Q110
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 5, 3, 40, 11, 50, 7, 12, 4, 9};
		      //     0  1  2   3   4  5   6  7  8   9
		System.out.println(Arrays.toString(a1));
		int left = 0, right = a1.length - 1;
		while(left <= right)
		{
			while(a1[left] % 2 == 0)
			{
				left++;
			}
			while(a1[right] % 2 == 1)
			{
				right--;
			}
			int temp = a1[left];
			a1[left] = a1[right];
			a1[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(a1));
	}
}


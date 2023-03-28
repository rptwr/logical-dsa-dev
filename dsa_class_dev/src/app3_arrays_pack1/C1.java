package app3_arrays_pack1;
/*
sum of left and right side at every 0th element
*/
import java.util.Arrays;
class C1 
{
	public static void main(String[] args) 
	{
		int[] arrays = {10, 20, 0, 10, 0, 100, 0, 30, 0, 90, 0, 200};
		System.out.println("Inital:" + Arrays.toString(arrays));
		for(int i = 0; i < arrays.length - 1; i++)
		{
			if (arrays[i] == 0)
			{
				arrays[i] = arrays[i +1] + arrays[i-1];
			}
		}
		System.out.println("Final:" + Arrays.toString(arrays));
	}
}

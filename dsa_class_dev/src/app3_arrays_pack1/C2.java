package app3_arrays_pack1;
/*
left-shift by 2
*/
import java.util.Arrays;
class C2
{
	public static void main(String[] args) 
	{
		int[] arrays = {10, 20, 30, 40, 50, 60, 70, 80};
		System.out.println("Inital:" + Arrays.toString(arrays));
		for(int i = 0; i < arrays.length - 2; i++)
		{
			arrays[i] = arrays[i + 2];
		}
		System.out.println("Final:" + Arrays.toString(arrays));
	}
}

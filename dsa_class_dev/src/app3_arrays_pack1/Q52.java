package app3_arrays_pack1;
/*
left-shift by 1
2, 5, 300, 0, 45, 109, 400, 412, 900, 900
*/
import java.util.Arrays;
class Q52 
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9
		System.out.println("iniital content:" + Arrays.toString(elements));
		for(int i = 0; i < elements.length - 1; i++)
		{
			elements[i] = elements[i + 1];
		}
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
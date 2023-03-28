package app3_arrays_pack1;
/*
swapping  element through for loop

*/

class Q49
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		for(int i = 0; i < array.length / 2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

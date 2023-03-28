package app3_arrays_pack1;
class Q43
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		array[3] = 500;
		array[1] = 400;
		array[5] = 200;
		array[0] = 100;
		array[4] = 300;
		array[2] = 900;
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

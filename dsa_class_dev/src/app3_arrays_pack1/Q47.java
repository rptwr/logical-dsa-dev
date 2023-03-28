package app3_arrays_pack1;
/*
swap elmnt adjacent to middile elmnt
*/

class Q47
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		int temp = array[(array.length / 2) - 2];
		array[(array.length / 2) - 2] = array[(array.length / 2) + 1]; 
		array[(array.length / 2) + 1] = temp; 
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

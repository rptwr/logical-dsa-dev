package app3_arrays_pack1;
/*
first element swapping with last element
*/

class Q44
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		int temp = array[0];
		array[0] = array[array.length - 1];  //last elmnt assigning to first location
		array[array.length - 1] = temp;   
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

package app3_arrays_pack1;
/*
swap second element to last second element
*/

class Q45
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		int temp = array[1];
		array[1] = array[array.length - 2]; 
		array[array.length - 2] = temp;   
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

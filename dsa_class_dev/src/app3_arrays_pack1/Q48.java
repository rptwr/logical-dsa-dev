package app3_arrays_pack1;
/*
swapping left side elmnt from right side elmnt
*/

class Q48
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		int temp = array[0];
		array[0] = array[5]; 
		array[5] = temp; 

		temp = array[1];
		array[1] = array[4];
		array[4] = temp;

		temp = array[2];
		array[2] = array[3];
		array[3] = temp;
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

// array reverse
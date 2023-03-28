package app3_arrays_pack1;
/*
Modify the content of array
to print content of the array use built-in stmnt(java.util.Arrays.toString(array)) to read all the elements of an array

*/
/*
class Q42
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		array[3] = 500;
		System.out.println("final:" + java.util.Arrays.toString(array));
	}
}

*/

class Q42
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5
		System.out.println("initial:" + java.util.Arrays.toString(array));
		array[3] = 500;
		System.out.println("m1:" + java.util.Arrays.toString(array));
		array[1] = 400;
		array[5] = 200;
		System.out.println("m2:" + java.util.Arrays.toString(array));
	}
}


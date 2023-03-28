package app3_arrays_pack1;
/*
import java.util.Arrays;  //to import and keep using Arrays.toString method
class Q51
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9

	    System.out.println("initial content:" + Arrays.toString(elements));
		elements[5] = elements[6];
		elements[6] = elements[7];
		elements[7] = elements[8];
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
*/
import java.util.Arrays;  //to import and keep using Arrays.toString method
class Q51
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};
		              //   0  1   2   3  4   5    6   7    8    9

	    System.out.println("initial content:" + Arrays.toString(elements));
		elements[3] = elements[4];
		System.out.println("m1:" + Arrays.toString(elements));
		elements[4] = elements[5];
		System.out.println("m2:" + Arrays.toString(elements));
		elements[5] = elements[6];
		System.out.println("m3:" + Arrays.toString(elements));
		elements[6] = elements[7];
		System.out.println("m4:" + Arrays.toString(elements));
		elements[7] = elements[8];
		System.out.println("m5:" + Arrays.toString(elements));
		elements[8] = elements[9];
		System.out.println("m6:" + Arrays.toString(elements));
	}
}
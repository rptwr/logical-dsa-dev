package app3_arrays_pack1;
/*
 The ArrayIndexOutOfBoundsException is one of the most common errors in Java.
 It occurs when a program attempts to access an invalid index in 
 an array i.e. an index that is less than 0, or equal to or 
 greater than the length of the array.
*/

class Q3 
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			System.out.println(array.length);
			System.out.println(array[8]);
		}
	}
}




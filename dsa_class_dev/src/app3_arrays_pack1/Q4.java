package app3_arrays_pack1;
/*
ArrayIndexOutOfBoundsException
*/

class Q4 
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			System.out.println(array.length);
			System.out.println(array[-1]);
		}
	}
}



package app3_arrays_pack1;
/*
  read three middile element
*/

class Q25
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80, 4};
		             //0   1   2  3   4    5    6  7  8
		{
				System.out.println(array[array.length/2 -1] + ", " + array[array.length / 2 ] + ", " + array[array.length / 2 + 1]);
		}
	}
}


/*
0, 500, 110
*/
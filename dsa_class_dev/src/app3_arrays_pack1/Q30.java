package app3_arrays_pack1;
/*
  read second half of array excluding middile element
*/

class Q30
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80, 4};
		             //0   1   2  3   4    5    6  7  8
		for(int i = (array.length / 2) + 1; i <= array.length - 1; i++)
		{
				System.out.print(array[i] + ", ");
		}
	}
}


/*
110, 5, 80, 4,
*/
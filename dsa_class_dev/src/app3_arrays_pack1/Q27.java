package app3_arrays_pack1;
/*
  read first half of array including middile element
*/

class Q27
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80, 4};
		             //0   1   2  3   4    5    6  7  8
		for(int i = 0; i <= (array.length/2); i++)
		{
				System.out.print(array[i] + ", ");
		}
	}
}


/*
10, 3, 40, 0,500,
*/
package app3_arrays_pack1;
/*
read the element except boundary
*/

class Q23
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
				for (int i = 1; i < array.length - 1; i++ )
				{
					System.out.print(array[i] + ", ");
				}
		}
	}
}


/*

*/
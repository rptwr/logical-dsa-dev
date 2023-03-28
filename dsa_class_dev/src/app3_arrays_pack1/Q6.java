package app3_arrays_pack1;
/*
print array element in reverse order
*/

class Q6
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			System.out.println(array.length);
			for(int i = array.length -  1; i >= 0; i--)
			{
				System.out.println(array[i]);
			}
		}
	}
}



package app3_arrays_pack1;
/*
find out maximum value in given interger array
*/

class Q36
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 11, 1, 15, 8 };
		             //0   1  2  3  4  5  6  7  
	
        int max = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println(max);

	}
}


/*

*/
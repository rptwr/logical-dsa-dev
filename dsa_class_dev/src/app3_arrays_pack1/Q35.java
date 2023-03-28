package app3_arrays_pack1;
/*
find out minimum value in given integer array
*/

class Q35
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 8, 1, 5, 8 };
		             //0   1  2  3  4  5  6  7  
	
        int min = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.println(min);

	}
}


/*

*/
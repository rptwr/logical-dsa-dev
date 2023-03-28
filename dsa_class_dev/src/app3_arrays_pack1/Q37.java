package app3_arrays_pack1;
/*
find out second minimum in given interger array
*/

class Q37
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 11, 1, 15, 8 };
		             //0   1  2  3  4  5  6  7  
	
        int min1 = array[0], min2 = array[0]; 
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] < min1)
			{
				min2 = min1;
				min1 = array[i];
			}
			
			else if(array[i] < min2)
			{
				min2 = array[i];
			}
			
		}
		System.out.println(min2);

	}
}

/*

*/
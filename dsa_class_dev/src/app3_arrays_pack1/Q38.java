package app3_arrays_pack1;
/*
find out second maximum in given interger array
*/

class Q38

{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 11, 1, 15, 8 };
		             //0   1  2  3  4  5  6  7  
	
        int max1 = array[0], max2 = array[0]; 
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] > max1)
			{
				max2 = max1;
				max1 = array[i];
			}
			
			else if(array[i] > max2)
			{
				max2 = array[i];
			}
			
		}
		System.out.println("max2:" + max2);

	}
}





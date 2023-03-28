package app3_arrays_pack1;
/*
  first half sum is  bigger or second half sum is bigger
*/

class Q33
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 8, 1, 5, 8 };
		             //0   1  2  3  4  5  6  7  
		
		int leftSum = 0, rightSum = 0;
		for(int i = 0; i < (array.length / 2); i++)
		{
				leftSum += array[i];
		}
		for(int i = (array.length / 2); i < array.length; i++)
		{
				 rightSum += array[i];
		}
		System.out.println(leftSum > rightSum ? "sum of first bigger" : "sum of second bigger");

	}
}


/*
44
*/

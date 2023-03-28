package app3_arrays_pack1;
/*
  find out avg of the numbers in given array
*/

class Q32
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 8, 1, 5, 8, 4};
		             //0   1  2  3  4  5  6  7  8
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			    //sum = sum + array[i];
				sum += array[i];

		}
		double avg = (double) sum / array.length;
		System.out.print("sum of all the elements :" + sum);
		System.out.print("avg of all the elements :" + avg);
	}
}


/*
44
*/
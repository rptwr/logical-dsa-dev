package app3_arrays_pack1;
/*
 odd indexed or even indexed element which is bigger
*/

class Q34
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 5, 0, 8, 1, 5, 8 };
		             //0   1  2  3  4  5  6  7  
		
		int oddSum = 0, evenSum = 0;
		/*
		for(int i = 0; i < array.length; i += 2)
		{
				evenSum += array[i];
		}
		for(int i = 1; i < array.length; i += 2)
		{
				 oddSum += array[i];
		}
		*/
		for (int i = 0; i < array.length - 1; i += 2)
		{
			evenSum += array[i];
			oddSum += array[i + 1];
		}
		System.out.println(evenSum > oddSum ? "even sum side bigger " : "odd sum side bigger");

	}
}


/*

*/
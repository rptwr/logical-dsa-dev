package app3_arrays_pack1;
/*
read alternative elemnt left to right right to left
10 80 40  110  500 0 5 3
*/

class Q16
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			//int half = array.length / 2;
			for(int i = 0; i < array.length; i += 2)
			{
				System.out.print(array[i] + ", " + array[(array.length - 1) - i] + ", ");
			}
		}
	}
}


/*

*/

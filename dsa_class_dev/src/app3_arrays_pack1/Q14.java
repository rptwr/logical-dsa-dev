package app3_arrays_pack1;
/*
reading one element from first half then second half
*/

class Q14
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			int half = array.length / 2;
			for(int i = 0; i < half; i++)
			{
				System.out.println(array[i] + ", " + array[half + i]);
			}
		}
	}
}


/*
10, 500
3, 110
40, 5
0, 80
*/
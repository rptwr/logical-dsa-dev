package app3_arrays_pack1;
/*
0, 500, 40, 110, 3, 5, 10, 80,
*/

class Q17
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
                     //0   1  2   3   4    5   6   7
        int half = array.length / 2;
		for (int i  = 0; i < half;  i++)
		{
			System.out.print(array[3 - i] + ", " + array[half + i ] + ", ");
		}
	}
}


/*

*/
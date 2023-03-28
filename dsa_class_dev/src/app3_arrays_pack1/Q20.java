package app3_arrays_pack1;
/*
//odd number from left side
3, 5,
*/

class Q20
{
	public static void main(String[] args)
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		              //0   1  2   3   4    5   6   7
		{
			for(int i = 0; i < array.length - 1; i++)
			{
				System.out.print((array[i] % 2 == 1) ? array[i] + ", " : " ");
			}
		}
	}
}

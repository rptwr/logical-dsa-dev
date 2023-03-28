package app3_arrays_pack1;
/*
find out the values where sum of two are the third one
1, 5, 6
6, 2, 8
2, 8, 10
10, 4, 14
14, 3, 17
*/

class Q39

{
	public static void main(String[] args)
	{
		int[] array = {1, 5, 6, 2, 8, 10, 4, 14, 3, 17, 25};
		             //0  1  2  3  4   5  6   7  8   9   10
		
		for(int i = 0; i < array.length - 2; i ++)
		{
			if(array[i] + array[i + 1] == array[i + 2])
			{
				System.out.println(array[i] + ", " + array[i + 1] + ", " + array[i + 2]);
			}
		}
	}
}




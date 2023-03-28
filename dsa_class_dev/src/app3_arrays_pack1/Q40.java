package app3_arrays_pack1;
/*
find out the values where subtraction of two are third one
5, 3, 2
3, 2, 1
14, 3, 11
*/

class Q40

{
	public static void main(String[] args)
	{
		int[] array = {1, 5, 3, 2, 1, 0, 4, 14, 3, 11, -9};
		             //0  1  2  3  4   5  6   7  8   9   10
		
		for(int i = 0; i < array.length - 2; i ++)
		{
			if(array[i] - array[i + 1] == array[i + 2])
			{
				System.out.println(array[i] + ", " + array[i + 1] + ", " + array[i + 2]);
			}
		}
	}
}




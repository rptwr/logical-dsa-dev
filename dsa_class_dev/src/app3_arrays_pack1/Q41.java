package app3_arrays_pack1;
/*
print the sequence where increasing order is continueing
1, 5, 
0, 4, 14
3, 11



class Q41

{
	public static void main(String[] args)
	{
		int[] array = {1, 5, 3, 2, 1, 0, 4, 14, 3, 11, -9};
		             //0  1  2  3  4   5  6   7  8   9   10
		
		for(int i = 0; i < array.length - 2; i++)
		{
			if(array[i] < array[i + 1])
			{
				System.out.print(array[i] + ", ");
			}
			else if(array[i] > array[i - 1])
			{
				System.out.print(array[i]);
				System.out.println();
			}
		}
	}
}
*/





class Q41

{
	public static void main(String[] args)
	{
		int[] array = {1, 3, 5, 7, 9, 3, 5, 19, 25, 10, 11, 13, 14, 18, 20, 2, 4};
		             //0   1  2  3 4  5  6  7   8    9   10  11  12  13  14 15  16
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i - 1] < array[i])
			{
				System.out.print(array[i] + ", ");
			}
			else
			{
				System.out.println();
				System.out.print(array[i] + ", ");
			}
		}
	}
}

/*
3, 5, 7, 9,
3, 5, 19, 25,
10, 11, 13, 14, 18, 20
2, 4,
*/
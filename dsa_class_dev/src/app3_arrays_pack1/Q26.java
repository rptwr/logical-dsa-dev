package app3_arrays_pack1;
/*
  read five middile element
*/

class Q26
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80, 4};
		             //0   1   2  3   4    5    6  7  8
		for(int i = (array.length/2)-2; i <= (array.length/2)+2; i++)
		{
				System.out.print(array[i] + ", ");
		}
	}
}


/*
40, 0, 500, 110, 5
*/
package app3_arrays_pack1;
/*
middile two numbers
*/

class Q22
{
	public static void main(String[] args) 
	{
		int[] array = {10, 3, 40, 0, 500, 110, 5, 80};
		             //0   1   2  3   4    5    6  7
		{
			    //int half = array.length / 2;
				//System.out.println(array[half - 1] + ", " + array[half]);
				System.out.println(array[(array.length / 2) - 1] + ", " + array[(array.length / 2)]);
		}
	}
}


/*
0, 500
*/
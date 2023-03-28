package app3_arrays_pack3_basics;
/*
Read first 2 elements and last 2 elements from an array 
which contains 10 elements
*/
class H
{
	public static void main(String[] args) 
	{
		int [] array={10,20,30,40,50,60,70,80,90,100};
		            // 0  1  2  3  4  5  6  7  8  9
		for (int i=0;i<array.length/2-3;i++ )
		{
			System.out.println(array[i]);
		}
		for (int i=array.length-1;i>array.length/2+2;i--)
		{
			System.out.println(array[i]);
		}
	}
}


/*
        This logic is using from last second element 90,100
        for (int i=;i<2;i++ )
		{
			System.out.println(array[i]);
		}
		for (int i=array.length-2;i<=array.length;i++)
		{
			System.out.println(array[i]);
		}



		*/
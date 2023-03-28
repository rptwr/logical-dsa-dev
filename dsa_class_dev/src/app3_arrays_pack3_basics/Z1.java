package app3_arrays_pack3_basics;
/*
Sum of the even elements
*/
class Z1
{
	public static void main(String[] args) 
	{
		int[] array={11,100,55,35,42,97,61,70,82,93};
		           // 0  1   2  3  4  5  6  7  8  9 
	   int even=0;
       for (int i=0;i<array.length ;i++ )
       {
		if (array[i]%2==0)
		{
			even+=array[i];
		}   
       }
	   System.out.println(even);
	}
}
package app3_arrays_pack3_basics;
/*
Sum of the all elements
*/
class Z
{
	public static void main(String[] args) 
	{
		int[] array={11,100,55,35,42,97,61,70,82,93};
		           // 0  1   2  3  4  5  6  7  8  9 
	   int sum=0;
       for (int i=0;i<array.length ;i++ )
       {
		sum+=array[i];   
       }
	   System.out.println(sum);
	}
}
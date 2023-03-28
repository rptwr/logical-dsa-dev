package app3_arrays_pack3_basics;
/*
Find out sum of all the elements
*/
class Q77
{
	public static void main(String[] args) 
	{
		int[] array={20,111,11,3,47,10,70,7,24,20};
		int sum=0;
		for ( int i=0 ; i<array.length ; i++ )
		{
			sum+=array[i];
		}
		System.out.println(sum);
	}
}
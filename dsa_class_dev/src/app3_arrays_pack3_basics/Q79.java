package app3_arrays_pack3_basics;
/*
Find out sum odd all the elements
*/
class Q79
{
	public static void main(String[] args) 
	{
		int[] array={20,111,11,3,47,10,70,7,24,20};
		int oddsum=0;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==1)
			{
			oddsum+=array[i];
			}
		}
		System.out.println(oddsum);
	}
}
package app3_arrays_pack3_basics;
/*
Find out avg of all the elements
*/
class Q82
{
	public static void main(String[] args) 
	{
		int[] array={21,111,11,3,47,11,71,7,25,21,23};
		double sum=0;
		double avg=0;
		for ( int i=0 ; i<array.length ;i++ )
		{
         sum+=array[i];
		}
		System.out.println(avg=sum/array.length);
		
	}
}
package app3_arrays_pack3_basics;
/*
Find out avg of all the even elements
*/
class Q83
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,47,11,71,7,25,21,23};
		double evensum=0;
		double avg=0;
		for ( int i=0 ; i<array.length ;i++ )
		{
         if (array[i]%2==0)
         {
			evensum+=array[i];
         }
		}
		System.out.println(avg=evensum/array.length);
		
	}
}
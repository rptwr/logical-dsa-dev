package app3_arrays_pack3_basics;
/*
Find out avg of all the odd elements
*/
class Q84
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,47,11,71,7,25,20,22};
		double oddsum=0;
		double avg=0;
		for ( int i=0 ; i<array.length ;i++ )
		{
         if (array[i]%2==1)
         {
			oddsum+=array[i];
         }
		}
		System.out.println(avg=oddsum/array.length);
		
	}
}
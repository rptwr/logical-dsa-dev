package app3_arrays_pack3_basics;
/*
Find out avg of all the elements except first and last 
elements
*/
class Q85
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,47,11,71,7,25,20,22};
		int sum=0;
		double avg=0;
		for ( int i=1 ; i<array.length-1 ;i++ )
		{
         if (array[i]%2==1)
         {
			sum+=array[i];
			System.out.println(sum);
         }
		}
		System.out.println(avg=sum/array.length);
		
	}
}
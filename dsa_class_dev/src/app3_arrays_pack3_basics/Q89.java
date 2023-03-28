package app3_arrays_pack3_basics;
/*
Find out sum of all the odd elements from even 
indexes
*/
class Q89
{
	public static void main(String[] args) 
	{
		int[] array={20,110,10,3,47,11,71,7,25,20,22};
		int oddsum=0;
		for ( int i=0;i<array.length ;i+=2)
		{
			if (array[i]%2==1)
			{
				oddsum+=array[i];
			}
        }
		System.out.println(oddsum);
		
	}
}
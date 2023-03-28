package app3_arrays_pack3_basics;
/*
Find out sum even all the elements
*/
class Q78
{
	public static void main(String[] args) 
	{
		int[] array={20,111,11,3,47,10,70,7,24,20};
		int evensum=0;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==0)
			{
			evensum+=array[i];
			}
		}
		System.out.println(evensum);
	}
}
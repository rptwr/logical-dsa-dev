package app3_arrays_pack3_basics;
/*
Read all even values from an array which are less 
than 10 or greater than 30 
*/
class Q76
{
	public static void main(String[] args) 
	{
		int[] array={40,111,11,4,47,10,70,7,34,20};
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==0)
			if (array[i]<10 || array[i]>30)
			{
		    System.out.println(array[i]+" ");
			}
		}
	}
}
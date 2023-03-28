package app3_arrays_pack3_basics;
/*
Read all odd values from an array which are less 
than 10 or greater than 30 
*/
class Q75
{
	public static void main(String[] args) 
	{
		int[] array={20,111,11,3,47,10,70,7,24,20};
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==1)
			if (array[i]<10 || array[i]>30)
			{
		    System.out.println(array[i]+" ");
			}
		}
	}
}
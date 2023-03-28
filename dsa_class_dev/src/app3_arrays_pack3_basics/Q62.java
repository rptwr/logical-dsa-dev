package app3_arrays_pack3_basics;
/*
Read the max value from an array
*/
class Q62
{

	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		int max=array[0];
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]>max)
			{
				max=array[i];
			 // System.out.print(max+" ");
			}
	  // System.out.print(max+" ");
		}
	System.out.print(max+" ");

	}
}
package app3_arrays_pack3_basics;
/*
Read the min value from an array
*/
class Q61
{

	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		int min=array[0];
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]<min)
			{
				min=array[i];
			 // System.out.print(min+" ");
			}
	  // System.out.print(min+" ");
		}
	System.out.print(min+" ");

	}
}
package app3_arrays_pack3_basics;
/*
Read first half of the elements from an array which 
contains 10 elements
*/
class Q49
{
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		for ( int i=0;i<array.length/2;i++ )
		{
	    System.out.print(array[i]+" ");
		}
	}
}
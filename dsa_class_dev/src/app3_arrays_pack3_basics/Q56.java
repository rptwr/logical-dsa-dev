package app3_arrays_pack3_basics;
/*
Read all the elements from an array except last 
element?
*/
class Q56
{
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		for ( int i=0; i<array.length-1 ;i++ )
		{
	    System.out.print(array[i]+" ");
		}
	}
}
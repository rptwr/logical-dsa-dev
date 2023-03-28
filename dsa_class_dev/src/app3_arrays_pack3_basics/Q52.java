package app3_arrays_pack3_basics;
/*
Read first half of the elements in the reverse order 
from an array which contains 10 elements

*/
class Q52
{
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		int half=array.length/2;
		for ( int i=half-1;i>=0;i-- )
		{
	    System.out.print(array[i]+" ");
		}
	}
}
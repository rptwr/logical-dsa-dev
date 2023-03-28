package app3_arrays_pack3_basics;
/*
Read every element in the reverse order
*/
class Q51
{
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		for ( int i=array.length-1;i>=0;i-- )
		{
	    System.out.print(array[i]+" ");
		}
	}
}
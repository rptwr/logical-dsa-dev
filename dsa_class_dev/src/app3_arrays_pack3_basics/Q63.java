package app3_arrays_pack3_basics;
/*
Read the elements which are 5 multiples from 
array
*/
class Q63
{

	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		int multiple=array[0];
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%5==0)
			{
              multiple=array[i];
			 System.out.print(multiple+" ");
			}
	  // System.out.print(max+" ");
		}
	//System.out.print(max+" ");

	}
}
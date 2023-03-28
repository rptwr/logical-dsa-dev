package app3_arrays_pack3_basics;
/*
Read index of bigger odd element from an array 
which contains 10 elements
*/
class Q40
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,51,1,700,71,20,22};
		int index=0;
		int big=0;
		for ( int i=0;i<array.length;i++ )
		{
		   if (array[i]%2==1)
			   if(array[i]>big)
				  {
					big=array[i];
					index=i;
				  }
			  // System.out.println(index);
	        //System.out.println(index);
		}
		System.out.println(index);
		System.out.println(big);
	}
}
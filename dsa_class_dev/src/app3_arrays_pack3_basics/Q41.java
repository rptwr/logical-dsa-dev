package app3_arrays_pack3_basics;
/*
Read index of smaller odd element from an array 
which contains 10 elements
*/
class Q41
{
	public static void main(String[] args) 
	{
		int[] array={110,20,30,51,700,1,71,21,22};
		int index=0;
		int small=Integer.MAX_VALUE;
		for ( int i=0;i<array.length;i++ )
		{
		   if (array[i]%2==1)
			   if(array[i]<small)
				  {
					small=array[i];
					index=i;
				  }
			  // System.out.println(index);
	        //System.out.println(index);
		}
		System.out.println(index);
		System.out.println(small);
	}
}
package app3_arrays_pack3_basics;
/*
Read index of smaller even element from an array 
which contains 10 elements
*/
class Q39
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,51,1,700,71,10,22};
		int even=0;
        int small=Integer.MAX_VALUE;
		int index=0;
		for (int i=0;i<array.length;i++ )
		{
		   if (array[i]%2==0)
			 {
			   //even=array[i];
			   //System.out.print(even+" ");
			   if(array[i]<small)
				  {
					small=array[i];
					index=i;
				  }
			  //System.out.println(small);
			  }
	       // System.out.println(small);
		}
		System.out.println(index);
		System.out.println(small);
	}
}
package app3_arrays_pack3_basics;
/*
Read all odd values from an array in between 10 
and 25 
*/
class Q73
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,4,10,70,8,23,20};
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==1)
			{
				if (array[i]>10 && array[i]<25)
				{
                 System.out.println(array[i]+" ");
				}
			}
      // System.out.println(array[i]+" ");		
		   }
        //  System.out.println(array[i]+" ");		
	}
}
package app3_arrays_pack3_basics;
/*
Read all even values from an array in between 10 
and 25 
*/
class Q74
{
	public static void main(String[] args) 
	{
		int[] array={20,110,11,3,4,10,70,8,24,20};
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==0)
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
package app3_arrays_pack3_basics;
/*
Read the min odd value from an array
*/
class Q67
{
	public static void main(String[] args) 
	{
		int[] array={6,20,38,51,4,11,71,6,22,20};
		int minodd=Integer.MAX_VALUE;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==1)
			{
				//System.out.println(array[i]+" ");
			if (array[i]<minodd)
			{
              minodd=array[i];
			 // System.out.println(minodd+" ");
			}
			}
           //System.out.println(minodd+" ");		
		   }
        System.out.println(minodd+" ");		
	}
}
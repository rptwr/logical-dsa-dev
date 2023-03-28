package app3_arrays_pack3_basics;
/*
Read the max odd value from an array
*/
class Q68
{
	public static void main(String[] args) 
	{
		int[] array={121,110,38,51,4,11,71,6,223,20};
		int maxodd=0;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==1)
			{
				//System.out.println(array[i]+" ");
			if (array[i]>maxodd)
			{
              maxodd=array[i];
			 // System.out.println(maxodd+" ");
			}
			}
           //System.out.println(maxodd+" ");		
		   }
        System.out.println(maxodd+" ");		
	}
}
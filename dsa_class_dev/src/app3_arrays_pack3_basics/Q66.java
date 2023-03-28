package app3_arrays_pack3_basics;
/*
Read the max even value from an array
*/
class Q66
{

	public static void main(String[] args) 
	{
		int[] array={6,20,38,51,4,11,71,6,22,20};
		int maxeven=0;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==0)
			if (array[i]>maxeven)
			{
              maxeven=array[i];
			 // System.out.println(maxeven+" ");
			}
          // System.out.println(maxeven+" ");		
		   }
        System.out.println(maxeven+" ");		
	}
}
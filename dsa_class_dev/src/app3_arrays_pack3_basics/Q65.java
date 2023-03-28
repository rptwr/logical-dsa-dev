package app3_arrays_pack3_basics;
/*
Read the min even value from an array
*/
class Q65
{

	public static void main(String[] args) 
	{
		int[] array={6,20,38,51,4,11,71,2,22,20};
		int mineven=Integer.MAX_VALUE;
		for ( int i=0 ; i<array.length ; i++ )
		{
			if (array[i]%2==0)
			if (array[i]<mineven)
			{
              mineven=array[i];
			 // System.out.println(mineven+" ");
			}
          // System.out.println(mineven+" ");		
		   }
        System.out.println(mineven+" ");		
	}
}
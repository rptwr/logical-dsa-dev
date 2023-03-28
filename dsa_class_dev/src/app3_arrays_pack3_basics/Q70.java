package app3_arrays_pack3_basics;
/*
Read middle 5 values from an array which contains 
odd number of elements
*/
class Q70
{
	public static void main(String[] args) 
	{
		int[] array={121,110,38,51,4,11,71,8,223,20,10};
		for ( int i=3 ; i<array.length-3 ; i++ )
		{
			if (array[i]%2==1)
			{
        System.out.println(array[i]+" ");		
			}
      // System.out.println(array[i]+" ");		
		   }
        //  System.out.println(array[i]+" ");		
	}
}
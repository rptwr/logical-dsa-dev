package app3_arrays_pack3_basics;
/*
Read middle 4 values from an array which contains 
even number of elements
*/
class Q71
{
	public static void main(String[] args) 
	{
		int[] array={121,110,38,50,4,10,70,8,223,20};
		for ( int i=3 ; i<array.length-3 ; i++ )
		{
			if (array[i]%2==0)
			{
        System.out.println(array[i]+" ");		
			}
      // System.out.println(array[i]+" ");		
		   }
        //  System.out.println(array[i]+" ");		
	}
}
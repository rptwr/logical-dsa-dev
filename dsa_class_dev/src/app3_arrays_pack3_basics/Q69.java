package app3_arrays_pack3_basics;
/*
Read middle 3 values from an array which contains 
odd number of elements
*/
class Q69
{
	public static void main(String[] args) 
	{
		int[] array={121,110,38,51,4,11,71,8,223,20,10};
		int i;
		for ( i=array.length/2-1 ; i<array.length/2+2 ; i++ )
		{
			if (array[i]%2==1)
			{
       // System.out.println(array[i]+" ");		
			}
       System.out.println(array[i]+" ");		
		   }
        //  System.out.println(array[i]+" ");		
	}
}
package app3_arrays_pack3_basics;
/*
Read all the elements from an array except middle element?
*/
class Q59
{
	/*
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		for ( int i=0,j=array.length-1; i<array.length/2-1 ;i++,j-- )
		{
	    System.out.print(array[i]+" "+array[i +array.length/2]+" ");
	   // System.out.print(array[j]+" ");
		}
	}
	*/ 
	//Except middle 2 elements...
    /*
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20};
		for ( int i=0; i<array.length;i++ )
		{
			if (i==array.length/2-1 || i==array.length/2)
			{
			continue;
			}
			System.out.print(array[i]+ " " );
		}
     */
	//Except middle 1 elements...
  
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22,20,25};
		for ( int i=0; i<array.length;i++ )
		{
			if (i==array.length/2 )
			{
			continue;
			}
			System.out.print(array[i]+ " " );
		}

		}
}
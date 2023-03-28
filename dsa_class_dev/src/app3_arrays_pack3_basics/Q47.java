package app3_arrays_pack3_basics;
/*
Read all the elements which are in between 15 and 
25 and in between 35 and 60 from an array which 
contains 10 elements
*/
class Q47
{
	public static void main(String[] args) 
	{
		int[] array={42,20,38,51,15,11,71,21,22};
		for ( int i=0;i<array.length;i++ )
		{
		    if (array[i]>15 && array[i]<25 )
	           	{ 
				System.out.print(array[i]+" ");
				}
				
		    if (array[i]>35 && array[i]<60)
			    {
			     System.out.print(array[i]+" ");
			    }
				 //System.out.print(array[i]+" ");
		}
	}
}
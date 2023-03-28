package app3_arrays_pack3_basics;
/*
Read index of bigger element from an array which 
contains 10 elements
*/
class Q36
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,51,61,700,71,20,22};
		int big=array[0];
        int index=0;
		for (int i=0;i<array.length;i++ )
		{
		   if (array[i]>big)
			  {
			   big=array[i];
			   index=i;
			  }
        }
	    System.out.println(big);
        System.out.println(index);
	}
}
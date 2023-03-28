package app3_arrays_pack3_basics;
/*
Read index of smaller element from an array which 
contains 10 elements
*/
class Q37
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,51,1,700,71,20,22};
		int small=array[0];
        int index=0;
		for (int i=0;i<array.length;i++ )
		{
		   if (array[i]<small)
			  {
			   small=array[i];
			   index=i;
	           System.out.println(small);
			  }
        }
	   // System.out.println(small);
       // System.out.println(index);
	}
}
package app3_arrays_pack3_basics;
/*
Read smaller odd element from an array which 
contains 10 elements
*/
class Q35
{
	public static void main(String[] args) 
	{
		int[] array={110,20,30,120,51,61,70,71,20,22};
		int small=array[0];
		for (int i=0;i<array.length ;i++ )
		{
          if (array[i]%2==1)
          {
		   if (array[i]<small)
			  {
			   small=array[i];
			  }
          }
		  //System.out.println(small);
		}
		 System.out.println(small);

	}
}
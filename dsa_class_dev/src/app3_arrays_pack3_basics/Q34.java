package app3_arrays_pack3_basics;
/*
Read bigger odd element from an array which 
contains 10 elements
*/
class Q34
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,120,51,61,70,71,20,22};
		int big=array[0];
		for (int i=0;i<array.length ;i++ )
		{
          if (array[i]%2==1)
          {
		   if (array[i]>big)
			  {
			   big=array[i];
			  }
          }
		  //System.out.println(big);
		}
		 System.out.println(big);

	}
}
package app3_arrays_pack3_basics;
/*
Read indexes of all odd elements from an array 
which contains 10 elements
*/
class Q43
{
	public static void main(String[] args) 
	{
		int[] array={110,20,30,51,700,1,71,21,22};
		int index=0;
		int odd=0;
		for ( int i=0;i<array.length;i++ )
		      {
		        if (array[i]%2==1)
				  {
					odd=array[i];
					index=i;
			 System.out.print(index+" ");
	         //System.out.println(odd);
			      }
			  }
	}
}
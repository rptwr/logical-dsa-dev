package app3_arrays_pack3_basics;
/*
Read indexes of all even elements from an array 
which contains 10 elements
*/
class Q42
{
	public static void main(String[] args) 
	{
		int[] array={110,20,30,51,700,1,71,21,22};
		int index=0;
		int even=0;
		for ( int i=0;i<array.length;i++ )
		      {
		        if (array[i]%2==0)
				  {
					even=array[i];
					index=i;
			 System.out.print(index+" ");
	         //System.out.println(even);
			      }
			  }
	}
}
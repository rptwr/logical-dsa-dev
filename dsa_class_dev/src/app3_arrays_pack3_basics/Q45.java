package app3_arrays_pack3_basics;
/*
Read all the elements which are next to odd 
elements
*/
class Q45
{
	public static void main(String[] args) 
	{
		int[] array={110,20,30,51,700,1,71,21,22};
		int odd=0;
		for ( int i=0;i<array.length-1;i++ )
		      {
		        if (array[i]%2==1)
				  {
					odd=array[i];
					array[i]=array[i+1];
			 System.out.print(array[i]+" ");
	        // System.out.println(odd+" ");
				  }
			// System.out.print(array[i]+" ");
	        // System.out.println(odd+" ");
			  }
	}
}
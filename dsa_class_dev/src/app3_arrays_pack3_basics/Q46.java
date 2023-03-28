package app3_arrays_pack3_basics;
/*
Read all the elements which are in between 6 and 
25 from an array which contains 10 elements?*/
class Q46
{
	public static void main(String[] args) 
	{
		int[] array={110,20,3,51,15,11,71,21,22};
		int index=0;
		for ( int i=0;i<array.length;i++ )
		      {
		        if (array[i]>6 && array[i]<25 )
				  {
			    System.out.print(array[i]+" ");
			        index=i;
				//System.out.print(index+" ");
				  }
			  }
	}
}
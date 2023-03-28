package app3_arrays_pack3_basics;
/*
Read index of last even number from an array 
which contains 10 elements
*/
class X
{
	public static void main(String[] args) 
	{
		int[] array={11,100,55,35,42,97,61,70,82,93};
		           // 0  1   2  3  4  5  6  7  8  9 
		int count=0;
       for (int i=array.length-1;i>=0 ;i-- )
       {
		   if(array[i]%2==0)
		   {
			 System.out.println(array[i]); 
			 break;
		   }
		 
       }
	}
}
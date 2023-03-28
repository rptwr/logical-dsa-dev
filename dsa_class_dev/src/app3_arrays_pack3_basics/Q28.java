package app3_arrays_pack3_basics;
/*
Read all even elements from an array which 
contains 10 elements
*/
class Q28
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,40,51,61,70,71};
		int even=0;
		for (int i=0;i<array.length;i++ )
		{
			if (array[i]%2==0)
			{
				even=array[i];
			 System.out.println(even);
			}
     
		}
			
	}
}

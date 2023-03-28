package app3_arrays_pack3_basics;
/*
Read smaller element from an array which contains 
10 elements
*/
class Q31
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,40,51,61,70,71,20,22};
		int small=array[0];
		for (int i=0;i<array.length;i++ )
		{
			if (array[i]<small)
			{
				small=array[i];
			}
		}
		    System.out.println(small);
	}
}

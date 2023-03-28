package app3_arrays_pack3_basics;
/*
Read smaller even element from an array which 
contains 10 elements
*/
class Q33
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,120,51,61,70,71,25,22};
		int small=array[0];
		for (int i=1;i<array.length;i++ )
		{
			if (array[i]%2==0)
			{
             if (array[i]<small)
                {
				 small=array[i];
                }
			}
		}	
		System.out.println(small);
	}
}
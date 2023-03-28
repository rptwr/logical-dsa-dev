package app3_arrays_pack3_basics;
/*
Read bigger element from an array which contains 
10 elements
*/
class Q30
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,40,51,61,70,71,20,85};
		int big=0;
		for (int i=1;i<array.length;i++ )
		{
			if (array[i]>big)
			{
				big=array[i];
				//System.out.println(big);
			}
		}
		    System.out.println(big);
	}
}

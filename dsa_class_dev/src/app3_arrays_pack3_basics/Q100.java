package app3_arrays_pack3_basics;
/*
Find out max value from the 2nd
 half where total 
number of elements are even
*/
class Q100
{
	public static void main(String[] args) 
	{
		int[] array={48,10,100,201,47,30,71,40,1,50};
		int max=0;
		for ( int i=array.length/2;i<array.length ;i++)
		{
			if(array[i]>max)
			{
             max=array[i];
			// System.out.println(array[i]);
			}
        }
		System.out.println(max);
		
	}
}
package app3_arrays_pack3_basics;
/*
Find out min value from the 2nd
 half where total 
number of elements are even
*/
class Q99
{
	public static void main(String[] args) 
	{
		int[] array={48,10,100,201,47,30,71,40,1,50};
		int min=Integer.MAX_VALUE;
		for ( int i=array.length/2;i<array.length ;i++)
		{
			if(array[i]<min)
			{
             min=array[i];
			// System.out.println(array[i]);
			}
        }
		System.out.println(min);
		
	}
}
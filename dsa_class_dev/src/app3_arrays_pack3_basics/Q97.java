package app3_arrays_pack3_basics;
/*
Find out min value from the first half where total 
number of elements are even
*/
class Q97
{
	public static void main(String[] args) 
	{
		int[] array={21,10,10,20,47,30,71,40,25,50};
		int min=Integer.MAX_VALUE;
		for ( int i=0;i<array.length/2 ;i++)
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
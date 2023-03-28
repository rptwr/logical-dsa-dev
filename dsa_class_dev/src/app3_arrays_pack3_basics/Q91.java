package app3_arrays_pack3_basics;
/*
Find out sum of all the elements except first, last 
and middle elements (total elements are odd) and also 
even index elements
*/
class Q91
{
	public static void main(String[] args) 
	{
		int[] array={20,110,10,3,47,11,71,7,25,20,15};
		int sum=0;
		for ( int i=1;i<array.length-1 ;i+=2)
		{
			if (i!=array.length/2)
			{
             //System.out.println(array[i]+" ");
			 sum+=array[i];
			}
        }
		System.out.println(sum);
		
	}
}
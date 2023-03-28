package app3_arrays_pack3_basics;
/*
Find out avg of all the elements except first, last 
and middle elements (total elements are odd)
*/
class Q86
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,47,11,71,7,25,20,22};
		int count=0;
		double sum=0;
		double avg=0;
		for ( int i=1;i<array.length-1 ;i++)
		{
			if (i!=array.length/2)
			{
				System.out.println(array[i]+" ");
				sum+=array[i];
				count++;
			}
        }
		System.out.println(avg=sum/count);
		
	}
}
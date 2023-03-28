package app3_arrays_pack3_basics;
/*
Find out avg of all the elements except first, last 
and middle elements (total elements are odd) and also 
odd index
*/
class Q96
{
	public static void main(String[] args) 
	{
		int[] array={21,10,10,20,47,30,71,40,25,50,60};
		double allsum=0;
		int count=0;
		double avg=0;
		for ( int i=0;i<array.length-1 ;i+=2)
		{
			if(i!=array.length/2)
			{
             System.out.println(array[i]+" ");
			 count++;
			 allsum+=array[i];
			}
        }
		System.out.println(allsum);
		System.out.println(avg=allsum/count);
		
	}
}
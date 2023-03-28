package app3_arrays_pack3_basics;
/*
Find out avg of all the elements except first and last 
elements and also from even index
*/
class Q95
{
	public static void main(String[] args) 
	{
		int[] array={21,10,10,20,47,30,71,40,25,50};
		double allsum=0;
		int count=0;
		double avg=0;
		for ( int i=1;i<array.length-1 ;i+=2)
		{
             System.out.println(array[i]+" ");
			 count++;
			 allsum+=array[i];
        }
		System.out.println(allsum);
		System.out.println(avg=allsum/count);
		
	}
}
package app3_arrays_pack3_basics;
/*
Find out avg of all the elements from even index
*/
class Q92
{
	public static void main(String[] args) 
	{
		int[] array={20,110,10,3,47,11,71,7,25,20,15};
		double evensum=0;
		int count=0;
		double avg=0;
		for ( int i=0;i<array.length ;i+=2)
		{
             System.out.println(array[i]+" ");
			 count++;
			 evensum+=array[i];
        }
		System.out.println(evensum);
		System.out.println(avg=evensum/count);
		
	}
}
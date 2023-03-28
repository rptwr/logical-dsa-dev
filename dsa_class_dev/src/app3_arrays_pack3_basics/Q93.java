package app3_arrays_pack3_basics;
/*
Find out avg of all the even elements from odd 
index
*/
class Q93
{
	public static void main(String[] args) 
	{
		int[] array={20,10,10,20,47,30,71,40,25,50,15};
		double evensum=0;
		int count=0;
		double avg=0;
		for ( int i=1;i<array.length ;i+=2)
		{
			if (array[i]%2==0)
			{
             System.out.println(array[i]+" ");
			 count++;
			 evensum+=array[i];
			}
        }
		System.out.println(evensum);
		System.out.println(avg=evensum/count);
		
	}
}
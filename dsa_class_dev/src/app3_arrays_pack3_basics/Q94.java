package app3_arrays_pack3_basics;
/*
Find out avg of all the odd elements from even 
index
*/
class Q94
{
	public static void main(String[] args) 
	{
		int[] array={21,10,10,20,47,30,71,40,25,50,15};
		double oddsum=0;
		int count=0;
		double avg=0;
		for ( int i=0;i<array.length ;i+=2)
		{
			if (array[i]%2==1)
			{
             System.out.println(array[i]+" ");
			 count++;
			 oddsum+=array[i];
			}
        }
		System.out.println(oddsum);
		System.out.println(avg=oddsum/count);
		
	}
}
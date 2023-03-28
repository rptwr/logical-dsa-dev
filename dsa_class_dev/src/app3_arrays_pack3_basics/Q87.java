package app3_arrays_pack3_basics;
/*
Find out sum of all the even indexed elements
*/
class Q87
{
	public static void main(String[] args) 
	{
		int[] array={21,110,11,3,47,11,71,7,25,20,22};
		int evensum=0;
		for ( int i=0;i<array.length ;i+=2)
		{
		       evensum+=array[i];
        }
		System.out.println(evensum);
		
	}
}
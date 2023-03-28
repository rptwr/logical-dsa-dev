package app3_arrays_pack3_basics;
/*
Find out sum of all the elements except first, last 
and middle elements (total elements are odd)
*/
class Q81
{
	public static void main(String[] args) 
	{
		int[] array={21,111,11,3,47,11,71,7,25,21,23};
		int half=array.length/2;
		int oddsum=0;
		int firstsum=0;
		int lastsum=0;
		for ( int i=1,j=array.length-2 ; i<half ; i++,j-- )
		{
        firstsum+=array[i];
        lastsum+=array[j];
		}
		System.out.println(oddsum=firstsum+lastsum);
		
	}
}
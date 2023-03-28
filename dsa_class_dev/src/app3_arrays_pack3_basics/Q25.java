package app3_arrays_pack3_basics;
/*Read index of last odd number from an array which 
contains 10 elements?

*/
class Q25
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,40,50,61,70};
		for (int i=array.length-1;i>=1 ;i-- )
		{
			if (array[i]%2==1)
			{
		    System.out.println(array[i]);
            break;
			}
		}

	}
}

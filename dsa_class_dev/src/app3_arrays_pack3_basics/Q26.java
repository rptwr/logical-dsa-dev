package app3_arrays_pack3_basics;
/*Read index of last 2nd even number from an array 
which contains 10 elements
*/
class Q26
{
	public static void main(String[] args) 
	{
		int[] array={10,20,30,40,50,61,70,71};
		int count=0;
		for (int i=array.length-1;i>=0;i-- )
		{
			if (array[i]%2==0)
			{
            count++;
			}
			if (count==2)
			{
            System.out.println("index"+i);
			}
		}

	}
}

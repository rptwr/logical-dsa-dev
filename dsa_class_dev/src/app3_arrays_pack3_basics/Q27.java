package app3_arrays_pack3_basics;
/*
Read index of last 3rd odd number from an array 
which contains 10 elements
*/
class Q27
{
	public static void main(String[] args) 
	{
		int[] array={11,20,30,40,51,61,70,71};
		int count=0;
		for (int i=array.length-1;i>=0;i-- )
		{
			if (array[i]%2==1)
			{
            count++;
			}
			if (count==3)
			{
            System.out.println(array[i]);
			break;
			}
		}

	}
}

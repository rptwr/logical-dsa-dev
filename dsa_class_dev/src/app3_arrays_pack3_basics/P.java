package app3_arrays_pack3_basics;
/*
Read 3rd odd element an array which contains 10 
elements
*/
class P
{
	public static void main(String[] args) 
	{
		int[] array={0,10,5,3,4,97,6,7,8,9,10};
		int count=0;
	for (int i=0; i<array.length ;i++ )
	{
        if (array[i]%2==1 )
        {
		   count++;
        }
		if (count==3)
		{
			System.out.println("The 3rd odd element is:"+array[i]);
			break;
		}
    }
          
	}
}

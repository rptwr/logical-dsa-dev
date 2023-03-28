package app3_arrays_pack3_basics;
/*
Read 2nd even element an array which contains 10 
elements
*/
class Q
{
	public static void main(String[] args) 
	{
		int[] array={1,10,5,3,4,97,6,7,8,9,10};
		int count=0;
	for (int i=0; i<array.length ;i++ )
	{
        if (array[i]%2==0 )
        {
		   count++;
        }
		if (count==2)
		{
			System.out.println("The 2nd even element is:"+array[i]);
			break;
		}
    }
          
	}
}

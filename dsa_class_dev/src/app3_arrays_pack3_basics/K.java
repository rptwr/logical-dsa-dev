package app3_arrays_pack3_basics;
/*
Read first even element an array which contains 10 
elements
*/
class K 
{
	public static void main(String[] args) 
	{
		int[] array={5,3,4,5,6,7,8,9,10};
		for (int i=0;i<array.length ;i++ )
		{
           if (array[i]%2==0 )
        {
             System.out.println("first even element is:" +array[i]); 
			 break;
        }

		}
	
	}
}

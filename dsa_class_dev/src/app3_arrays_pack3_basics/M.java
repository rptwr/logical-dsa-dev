package app3_arrays_pack3_basics;
/*
Read first odd element an array which contains 10 
elements
*/
class M 
{
	public static void main(String[] args) 
	{
		int[] array={0,10,5,3,4,5,6,7,8,9,11};
		for (int i=0;i<array.length;i++ )
		{
           if (array[i]%2==1 )
        {
           System.out.println("last odd element is:"+array[i]);
		   break;
			
        }
		}
	
	}
}

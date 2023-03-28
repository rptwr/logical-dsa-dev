package app3_arrays_pack3_basics;
/*
Read last even element an array which contains 10 
elements
*/
class L 
{
	public static void main(String[] args) 
	{
		int[] array={5,3,4,5,6,7,8,9,11};
		for (int i=array.length-1;i>=0;i-- )
		{
           if (array[i]%2==0 )
        {
           System.out.println("last even element is"+array[i]);
		   break;
			
        }
		}
	
	}
}

package app3_arrays_pack3_basics;
/*
Read Last odd element an array which contains 10 
elements
*/
class O
{
	public static void main(String[] args) 
	{
		int[] array={0,10,5,3,4,5,6,7,8,9,10};
		for (int i=array.length-1; i>=0 ;i-- )
		{
           if (array[i]%2==1 )
        {
           System.out.println("Last odd element is:"+array[i]);
		   break;
			
        }
		}
	
	}
}

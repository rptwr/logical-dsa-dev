package app3_arrays_pack3_basics;
/*
 Read index of first even number from an array 
which contains 10 elements
*/
class U
{
	public static void main(String[] args) 
	{
		int[] array={11,101,55,36,42,97,61,70,82,94};
		           // 0  1   2  3  4  5  6  7  8  9 
       for (int i=0;i<array.length ;i++ )
       {
		   if(array[i]%2==0)
		   {
            System.out.println("first even index num:"+ i);
		    break;
		   }
       }
	}
}
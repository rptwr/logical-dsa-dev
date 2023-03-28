package app3_arrays_pack3_basics;
/*
Read index of 2nd even number from an array 
which contains 10 elements
*/
class W
{
	public static void main(String[] args) 
	{
		int[] array={11,100,55,35,42,97,61,70,82,94};
		           // 0  1   2  3  4  5  6  7  8  9 
	   int count=0;
       for (int i=0;i<array.length ;i++ )
       {
		   if(array[i]%2==0)
		   {
            count++;
		   }
		   if (count==2)
		   {
			System.out.println("index of second even num:" + i);
			break;
		   }
       }
	}
}
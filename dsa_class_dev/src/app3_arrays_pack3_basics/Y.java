package app3_arrays_pack3_basics;
/*
Read index of 3rd odd number from an array which 
contains 10 elements
*/
class Y
{
	public static void main(String[] args) 
	{
		int[] array={11,100,55,35,42,97,61,70,82,94};
		           // 0  1   2  3  4  5  6  7  8  9 
	   int count=0;
       for (int i=0;i<array.length ;i++ )
       {
		   if(array[i]%2==1)
		   {
            count++;
		   }
		   if (count==3)
		   {
			System.out.println("index of third odd num:" + i);
			break;
		   }
       }
	}
}
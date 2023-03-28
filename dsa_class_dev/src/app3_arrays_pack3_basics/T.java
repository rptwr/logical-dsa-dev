package app3_arrays_pack3_basics;
/*
 Read middle element from an array which contains 
even number of elements
*/
class T
{
	public static void main(String[] args) 
	{
		int[] array={10,100,55,36,42,97,61,70,82,94};
		           // 0  1   2  3  4  5  6  7  8  9 
          System.out.println((array.length/2-1) + "," +  array.length/2  );
	}
}
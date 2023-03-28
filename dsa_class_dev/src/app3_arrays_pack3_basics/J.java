package app3_arrays_pack3_basics;
/*
Read first 5 elements and last 2 elements from an array 
which contains 10 elements
*/
class J
{
	public static void main(String[] args) 
	{
		int [] array={10,20,30,40,50,60,70,80,90,100};
		            // 0  1  2  3  4  5  6  7  8  9
	    for (int i=0;i<=array.length-1;i++ )
		{
			if(i<5 || 7<i)
			System.out.print(array[i]+" ");
		}
        /*
		System.out.println();

		int half=array.length/2;
		for (int i=0;i<array.length/2;i++ )
		{
			System.out.print(array[i]+",");
		}
		System.out.println();

		for (int i=array.length-2;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
		*/
	}
}



      

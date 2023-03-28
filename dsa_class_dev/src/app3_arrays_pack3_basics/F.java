package app3_arrays_pack3_basics;
/*
Read first 5 elements from an array which contains 10 
elements
*/
class F
{
	public static void main(String[] args) 
	{
		int [] array={10,20,30,40,50,60,70,80,90,100};
		            // 0  1  2  3  4  5  6  7  8  9
		int half=array.length/2;
		//this is the correct logic
		for (int i=0; i<half ;i++ )
		{
			System.out.print(array[i]+" ");
		}
/*
		System.out.println();

		for (int i=0; i<5 ;i++ )
		{
			System.out.print(array[i]+" ");
		}

     	System.out.println();

		for (int i=0; i<=4 ;i++ )
		{
			System.out.print(array[i]+" ");
		}
*/		
	}
}

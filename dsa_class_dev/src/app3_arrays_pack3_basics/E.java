package app3_arrays_pack3_basics;
/*
Read last two elements from an array which contains 10 
elements
*/
class E
{
	public static void main(String[] args) 
	{
		int [] array={10,20,30,40,50,60,70,80,90,100};
		            // 0  1  2  3  4  5  6  7  8  9
		System.out.println("array of second last element:" +array[array.length-2]);
		System.out.println("array of last element:" +array[array.length-1]);
	}
}

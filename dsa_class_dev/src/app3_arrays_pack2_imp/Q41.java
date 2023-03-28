package app3_arrays_pack2_imp;
class Q41
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,8 ,1 ,5 ,8 };
		//              0  1  2  3  4  5  6  7
		int evensum = 0;
		int oddsum = 0;
		for (int i =0; i<array.length-1; i+=2)
		{
			evensum+=array[i];
			oddsum+=array[i+1];
		}
		System.out.println(evensum>oddsum? "even sum side bigger "+ evensum: "odd sum bigger: "+ oddsum);
	}
}
package app3_arrays_pack2_imp;
class Q40
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,8 ,1 ,5 ,8 ,4 };
		//              0  1  2   3   4    5   6  7   8
		int evensum = 0;
		int oddsum = 0;
		for (int i = 0;i<array.length  ; i+=2)
		{
			evensum +=array[i];
		}
		for (int i = 1;i<array.length ;i+=2)
		{
			oddsum +=array[i];
		}
			System.out.print(evensum>oddsum? "even index are bigger: " + evensum: "odd index is bigger: "+ oddsum);
	}
}
//even index are bigger 32
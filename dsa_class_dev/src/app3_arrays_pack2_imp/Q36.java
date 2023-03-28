package app3_arrays_pack2_imp;
class Q36
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,8 ,1 ,5 ,8 ,4 };
		//              0  1  2   3   4    5   6  7   8
		int sum = 0;
		for (int i = 0;i<array.length ; i++)
		{
			sum +=array[i];
		}
			System.out.print(sum);
	}
}
// 44
package app3_arrays_pack2_imp;
class Q35
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,40 ,0 ,500 ,110 ,5 ,80 ,4 };
		//              0  1  2   3   4    5   6  7   8
		int sum = 0;
		for (int i = 0;i<array.length ; i++)
		{
			sum +=array[i];
		}
			System.out.print(sum + ", ");
	}
}
// 752
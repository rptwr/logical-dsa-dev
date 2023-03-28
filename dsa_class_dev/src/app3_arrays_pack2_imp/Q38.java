package app3_arrays_pack2_imp;
class Q38
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,8 ,1 ,5 ,8 ,4 };
		//              0  1  2   3   4    5   6  7   8
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0;i<array.length/2 ; i++)
		{
			sum1 +=array[i];
			sum2 +=array[i+array.length/2];
		}
			System.out.print(sum1<sum2?sum1+ "first half is bigger":sum2+ "second half is bigger");
	}
}
// first half is bigger
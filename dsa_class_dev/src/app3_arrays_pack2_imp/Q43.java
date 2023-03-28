package app3_arrays_pack2_imp;
class Q43
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,11 ,1 ,15 ,8 };
		//              0  1  2  3  4  5  6  7
		int max=array[0];
		for (int i =1; i<array.length; i++)
		{
			max=max>array[i]?max:array[i];
		}
		System.out.println("maximum value of index is "+ max);
	}
}
//maximum value of index is 15
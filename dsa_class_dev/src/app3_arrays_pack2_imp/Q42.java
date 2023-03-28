package app3_arrays_pack2_imp;
class Q42
{
	public static void main(String[] args) 
	{
		int[] array = {10 ,3 ,5 ,0 ,8 ,1 ,5 ,8 };
		//              0  1  2  3  4  5  6  7
		int min=array[0];
		for (int i =1; i<array.length; i++)
		{
			min=min<array[i]?min:array[i];
		}
		System.out.println("minimum value of index is "+ min);
	}
}
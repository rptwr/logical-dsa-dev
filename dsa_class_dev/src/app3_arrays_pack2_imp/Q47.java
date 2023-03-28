package app3_arrays_pack2_imp;
class Q47
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5 , 3 , 2 , 1 , 0 , 4 , 14 , 3 , 11 , -9 };
		for (int i = 0;i<array.length-2; i++)
		{
			if (array[i]-array[i+1]==array[i+2])
			{
				System.out.println(array[i]+", " +array[i+1]+", "+ array[i+2]);
			}
		}
	}
}

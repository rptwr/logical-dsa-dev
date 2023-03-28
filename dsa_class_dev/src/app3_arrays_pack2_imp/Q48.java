package app3_arrays_pack2_imp;
class Q48 
{
	public static void main(String[] args) 
	{
		int[] array = {1,3,5,7,9,3,5,19,25,10,11,13,14,18,20,2,4};
		System.out.print(array[0]+", ");
		for (int i = 1;i<array.length ;i++ )
		{
			if (array[i-1]<array[i])
			{
				System.out.print(array[i]+", ");
			}
			   else 
			{
				    System.out.println();
					System.out.print(array[i]+", ");
			}
		}
	}
}

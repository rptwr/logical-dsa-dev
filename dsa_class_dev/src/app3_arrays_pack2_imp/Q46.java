package app3_arrays_pack2_imp;
class Q46 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 5 , 6 , 2 , 8 , 10 , 4 , 14 , 3 , 17 , 25 };
		for (int i = 0;i<array.length-2; i++)
		{
			if (array[i]+array[i+1]==array[i+2])
			{
				System.out.println(array[i]+", " +array[i+1]+", "+ array[i+2]);
			}
		//	System.out.print(array[i]+array[i+1]==array[i+2]?array[i]+", " +array[i+1]+", "+ array[i+2]+", ":"");
		//  System.out.println();
		}
	}
}

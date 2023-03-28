package app3_arrays_pack2_imp;
class Q44
{
	public static void main(String[] args) 
	{
		int[] array = {0 ,3 ,5 ,2 ,11 ,1 ,15 ,8 };
		//              0  1  2  3  4  5  6  7
		int firstMin=array[0];
		int secondMin=array[0];
		for (int i =1; i<array.length; i++)
		{
			if (array[i]<firstMin)
			{
				secondMin = firstMin;
				firstMin=array[i];
			}
				else if (array[i] <secondMin)
				{
					secondMin=array[i];
				}
   		}
		System.out.println(secondMin);
	}
}
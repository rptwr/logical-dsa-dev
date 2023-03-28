package app3_arrays_pack2_imp;
class  Q59
{
	public static void main(String[] args) 
	{
		int[] array= {30,46,90,20,42,76,85,94,76,40};
		System.out.println("initial array: "+ java.util.Arrays.toString(array));
		System.out.println("reverse elements in the array");
		int temp;
		for (int i = 0;i<array.length/2; i++)
		{
			temp = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		System.out.println();
		System.out.println("final array after reversing: "+ java.util.Arrays.toString(array));
	}
}

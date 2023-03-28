package app3_arrays_pack2_imp;
class  Q55
{
	public static void main(String[] args) 
	{
		int[] array= {10, 20, 30, 40, 50, 60};
		System.out.println("initial:"+java.util.Arrays.toString(array));
		int temp = array[array.length/2-1-1];
		array[array.length/2-1-1] = array[array.length/2+1];
		array[array.length/2+1]= temp;
		System.out.println("final:"+java.util.Arrays.toString(array));
	}
}
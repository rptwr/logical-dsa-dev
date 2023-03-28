package app7_recursive_algo;

/*
read all element of array elements in reverse without a for loop
*/

class M10
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50, 60};
		print(elements, elements.length - 1);
	}
	public static void print(int[] elements, int i) 
	{
		if(i < 0)
		{
			return;
		}
		System.out.println(elements[i] + ", ");
		i--;
		print(elements, i);

	}
}
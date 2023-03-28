package app3_arrays_pack1;
/*
reading the content of the array in reverse order
reversing content of the array
*/
/*
class Q50
{
	public static void main(String[] args)
	{
		int[] array = {10, 20, 30, 40, 50, 60};
		           //  0   1    2   3   4   5

	    System.out.println("initial:" + java.util.Arrays.toString(array));
		for(int i = 0; i < array.length / 2; i++)
		{
		    int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	    System.out.println("final:" + java.util.Arrays.toString(array));
	}
}


class Q50
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};

	    System.out.println("initial content:" + java.util.Arrays.toString(elements));
		System.out.println("reading elements in the reverse order");
		for(int i = elements.length - 1; i >= 0; i--)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		System.out.println("final content:" + java.util.Arrays.toString(elements));
	}
}


*/

class Q50
{
	public static void main(String[] args)
	{
		int[] elements = {10, 2, 5, 300, 0, 45, 109, 400, 412, 900};

	    System.out.println("initial content:" + java.util.Arrays.toString(elements));
		System.out.println("reversing elements in the array");
		int temp;
		for(int i = 0; i < elements.length / 2; i++)
		{
			temp = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length - 1 - i] = temp;
		}
		System.out.println();
		System.out.println("final content:" + java.util.Arrays.toString(elements));
	}
}
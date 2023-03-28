package arrays_dev;
class M42
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
		//                 0   1  2  3    4   5   6   7   8  9   10  11  
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
		System.out.println();

		//remove  4th, 5th elements (index number 3 and 4 elements)
		
		for(int i = 3; i < elements.length - 2; i++)
		{
			elements[i] = elements[i + 2];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 2];
		for(int i = 0; i < elements.length; i++)
		{
			elements[i] = temp[i];
		}
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++)
		{
			System.out.print(elements[i] + ",");
		}
	}
}

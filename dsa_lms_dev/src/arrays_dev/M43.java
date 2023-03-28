package arrays_dev;
class M43
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

		//remove  from 3rd to 6th element (index number 2, 3, 4 and 5 elements)
		//left shift by 4 from index number 2
		for(int i = 2; i < elements.length - 4; i++)
		{
			elements[i] = elements[i + 4];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 4];
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

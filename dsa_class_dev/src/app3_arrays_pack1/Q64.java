package app3_arrays_pack1;
/*
find out missed element from a given array
output should be: 3, 6, 9, 11, 12, 13, 16, 17, 19
*/

class Q64 
{
	public static void main(String[] args) 
	{
		int[] elements = {5, 14, 2, 4, 8, 7, 20, 10, 15, 18};
		{
			int min = elements[0];
			int max = elements[0];
			//int min = elements[0], max = elements[0];
			for(int i = 1; i < elements.length; i++)
			{
				if(elements[i] < min)
				{
					min = elements[i];
				}
				else if(elements[i] > max)
				{
					max = elements[i];
				}
			}
			int[] temp = new int[max + 1];
			for(int i = 0; i < elements.length; i++)
			{
				temp[elements[i]] = min - 1;
			}
			System.out.println("missed elements");
			for(int i = min + 1; i < temp.length; i++)
			{
				if(temp[i] != (min - 1))
				{
					System.out.print(i + ", ");
				}
			}
		}
	}
}
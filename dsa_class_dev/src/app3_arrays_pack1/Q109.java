package app3_arrays_pack1;

/*
find out common elmnts from two given arrays
*/
import java.util.Arrays;
class Q109
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 20, 30, 40, 50, 4, 6, 9, 100, 1, 6};
		int[] a2 = {50, 44, 234, 4, 90, 6, 2, 9, 20};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println("common elements:");
		//outer:
		for(int i = 0; i < a1.length; i++)
		{
			for(int j = 0; j < a2.length; j++)
			{
				if(a1[i] == a2[j])
				{
					System.out.print(a1[i] + ", ");
					//continue outer;
				}
			}
		}
	}
}


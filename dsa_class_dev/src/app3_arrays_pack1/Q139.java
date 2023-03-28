package app3_arrays_pack1;

/*
 * Find out the given array is a mountain array or not?
 * {1, 2, 3, 4, 9, 8, }
 * */


public class Q139 {
	public static void main(String[] args) {
		int[] a1 = {1, 4, 7, 9, 100, 90, 7, 0};
		int[] a2 = {1, 4, 7, 2, 9, 100, 90, 7, 0};
		int[] a3 = {1, 4, 7, 9, 100, 190, 297, 500};
//		int[] a4 = {1000, 900, 800, 700, 600, 500, 200, 100};
		a1 = a3;
		boolean isMountain = true, ascending = true;
		if (a1.length < 3)
		{
			System.out.println(false);
			return;
		}
		for (int i = 0; i < a1.length - 1; i++) 
		{
			if (ascending) 
			{
				if (a1[i] > a1[i + 1]) 
				{
					ascending = false;
				}
			}
			else 
			{
				if (a1[i] < a1[i + 1]) 
				{
					isMountain = false;
					break;
				}
			}
		}
		System.out.println(!ascending && isMountain);
	}
}
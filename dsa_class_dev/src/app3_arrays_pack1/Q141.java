package app3_arrays_pack1;

/*
 *  Remove the duplicate of 3rd and more occurrences
 * */


import java.util.Arrays;

public class Q141 {
	public static void main(String[] args) {
		int[] a1 = {1, 3, 6, 2, 9, 4, 40, 2, 7, 1, 3, 6, 2, 9, 4, 2, 
					7, 1, 3, 6, 2, 9, 4, 2, 7, 1, 3, 6, 2, 40, 9, 4,
					2, 7, 1, 3, 6, 2, 9, 4, 40, 2, 7};
		int count = 0;
		boolean isSecondOccurance;
		for (int i = 0; i < a1.length; i++)
		{
			isSecondOccurance = true;
			for (int j = i + 1; j < a1.length - count; j++)
			{
				if (a1[i] == a1[j])
				{
					if (isSecondOccurance)
					{
						isSecondOccurance = false;
						continue;
					}
					for (int k = j; k < a1.length - 1 - count; k++)
					{
						a1[k] = a1[k + 1];
					}
					j--;
					count++;
				}
			}
		}
		int[] temp = a1;
		a1 = new int[temp.length - count];
		for (int i = 0; i < a1.length; i++)
		{
			a1[i] = temp[i];
		}
		System.out.println("final:" + Arrays.toString(a1));
	}
}
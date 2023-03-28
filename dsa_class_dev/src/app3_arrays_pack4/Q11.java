/*
 *  Replace every element with the biggest element 
 *  which in the right of the current element 
 * */

package app3_arrays_pack4;

import java.util.Arrays;

public class Q11 {
	public static void main (String[] args) {
		int[] a1 = {1, 90, 20, 60, 40, 190, 80, 50, 100, 30};
		System.out.println("initial:" + Arrays.toString(a1));
		int biggerInRight;
		for (int i = 0; i < a1.length - 1; i++)
		{
			biggerInRight = a1[i];
			for (int j = i + 1; j < a1.length; j++)
			{
				if (biggerInRight < a1[j])
				{
					biggerInRight = a1[j];
				}
			}
			a1[i] = biggerInRight;
		}
		System.out.println("final:" + Arrays.toString(a1));
	}
}
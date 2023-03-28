// bubble sort
package app3_arrays_pack2_imp;

import java.util.Arrays;

public class M1 {
	public static void main(String[] args) {
		int[] data = {10, 2, 15, 1, 14, 4, 8, 18, 9, 11};
		System.out.println(Arrays.toString(data));
		int temp;
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data.length - 1 - i; j++)
			{
				if (data[j] > data[j + 1])
				{
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
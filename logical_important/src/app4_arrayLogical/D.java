package app4_arrayLogical;

import java.util.Arrays;

public class D {
	public static void main(String[] args) {
		int[] a1 = { 8, 1, 7, 6, 5, 9 };
		for (int i = 0; i < a1.length / 2; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] > a1[j]) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		for (int i = a1.length / 2; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] < a1[j]) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1));
	}
}

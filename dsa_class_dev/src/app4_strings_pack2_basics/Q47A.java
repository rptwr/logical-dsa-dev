package app4_strings_pack2_basics;

import java.util.Scanner;

//Find out first non repeated character // second approach

public class Q47A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars");
		String s1 = sc.nextLine();
		char c1 = s1.charAt(0);
		boolean nonRepeated = false;
		for (int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			if (s1.indexOf(c1, i + 1) == -1 && s1.lastIndexOf(c1, i - 1) == -1) {
				nonRepeated = true;
				break;
			}
		}
		System.out.println(nonRepeated ? "first non-repeated char : " + c1 : "no non-repeated chars in " + s1);
	}
}
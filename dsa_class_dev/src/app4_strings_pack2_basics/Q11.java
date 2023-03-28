package app4_strings_pack2_basics;

////reading first 3 chars and last 3 character using for loop

public class Q11 {
	public static void main(String[] args) {
		String s1 = "abcdefghij";
		// 0123456789
		System.out.println(s1);
		for (int i = 0; i < 3; i++) {
			System.out.print(s1.charAt(i));
			System.out.print(s1.charAt(s1.length() - 1 - i));
		}
	}
}

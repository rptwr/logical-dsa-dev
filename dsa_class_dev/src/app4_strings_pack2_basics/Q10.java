package app4_strings_pack2_basics;

//reading first 3 chars and last 3 character

public class Q10 {
	public static void main(String[] args) {
		String s1 = "abcdefghij";
		//           0123456789
		System.out.println(s1);
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(s1.length() - 2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(s1.length() - 3));
	}
}

package app4_strings_pack2_basics;

// indexOf(String)

public class Q20 {
	public static void main(String[] args) {
		String s1 = "abc abc abc abc abc";
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 2));
		System.out.println(s1.indexOf("abc", 5));
		System.out.println(s1.indexOf("abc", 8));
		System.out.println(s1.indexOf("abc", 12));
		System.out.println(s1.indexOf("abc", 17));
	}
}

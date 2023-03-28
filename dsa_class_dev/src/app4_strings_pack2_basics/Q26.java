package app4_strings_pack2_basics;

// lastIndexOf(string)

public class Q26 {
	public static void main(String[] args) {
		String s1 = "abc java abc abc";
				//   0123456789
		System.out.println(s1.lastIndexOf("abc"));
		System.out.println(s1.lastIndexOf("abc", 12));
		System.out.println(s1.lastIndexOf("abc", 5));
		System.out.println(s1.lastIndexOf("abc", 0));
	}
}

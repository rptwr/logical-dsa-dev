package app4_strings_pack1;

public class Q32 {
	public static void main(String[] args) {
		String s1 = "abchelloxyzabchelloxyz";
		           //0123456789
		System.out.println(s1.lastIndexOf("abc"));
		System.out.println(s1.lastIndexOf("hello"));  //searching order from right to left
		System.out.println(s1.lastIndexOf("xyz"));
		System.out.println(s1.lastIndexOf("test"));
		System.out.println(s1.lastIndexOf("abcd"));
		System.out.println(s1.lastIndexOf("abc", 10));
		System.out.println(s1.lastIndexOf("xyz", 10));
		System.out.println(s1.lastIndexOf("hello", 5));
		System.out.println(s1.lastIndexOf("abc", 10));
		System.out.println(s1.lastIndexOf("abc", 1));
	}
}

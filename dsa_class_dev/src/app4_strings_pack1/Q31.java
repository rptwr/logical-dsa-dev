package app4_strings_pack1;

public class Q31 {
	public static void main(String[] args) {
		String s1 = "abchelloxyzabchelloxyz";
		System.out.println(s1.indexOf("abc"));     //searching order left to right
		System.out.println(s1.indexOf("hello"));  //checking entire string
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("test"));
		System.out.println(s1.indexOf("abcd"));
		System.out.println(s1.indexOf("abc", 5));
		System.out.println(s1.indexOf("xyz", 5));
		System.out.println(s1.indexOf("hello", 5));
		System.out.println(s1.indexOf("abc", 15));
	}
}


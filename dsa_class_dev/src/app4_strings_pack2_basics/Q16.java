package app4_strings_pack2_basics;

public class Q16 {
	public static void main(String[] args) {
		String s1 = "abc abc abc";
		//			 0123456789
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('a', 3));  // searching for (a) from index number 3 onwards
		System.out.println(s1.indexOf('b', 3));
		System.out.println(s1.indexOf('c', 3));
		System.out.println(s1.indexOf('a', 7));
		System.out.println(s1.indexOf('b', 7));
		System.out.println(s1.indexOf('c', 7));
	}
}


// indexOf() keep searching from left to right by default
// if you want to specific starting point then provide that as second argument.

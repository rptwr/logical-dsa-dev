package app4_strings_pack1;

public class Q16 {
    public static void main(String[] args) {
		String s1 = "abcabcabcabc";
		         //  012345678
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('c', 7));  // from which char onwards searching should be done
		System.out.println(s1.indexOf('b', 7));
		System.out.println(s1.indexOf('a', 7));
		System.out.println(s1.indexOf('c', 2));
		System.out.println(s1.indexOf('b', 2));
		System.out.println(s1.indexOf('a', 2));
	}
}

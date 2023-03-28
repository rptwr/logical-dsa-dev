package app4_strings_pack1;

public class M1 {
	public static void main(String[] args) {
		String s1 = "abcabcabcabc";
        	     //  012345678
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('b', 7));
	}
}
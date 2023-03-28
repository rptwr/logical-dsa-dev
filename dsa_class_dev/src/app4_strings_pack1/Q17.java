package app4_strings_pack1;

public class Q17 {
	public static void main(String[] args) {
		String s1 = "abcabcabcabc";
		         //  012345678
		
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 9));
		System.out.println(s1.indexOf('a', 10));  // from 10 onwards there is no a thats why we are getting -1
	}
}

// searching char not available we will get -1
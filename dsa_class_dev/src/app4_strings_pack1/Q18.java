package app4_strings_pack1;

public class Q18 {
	public static void main(String[] args) {
		String s1 = "abcabcabcabc";
		         //  012345678
		
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('b'));
		System.out.println(s1.lastIndexOf('c', 7));
		System.out.println(s1.lastIndexOf('a', 7));
		System.out.println(s1.lastIndexOf('b', 7));
		System.out.println(s1.lastIndexOf('c', 3));
		System.out.println(s1.lastIndexOf('a', 3));
		System.out.println(s1.lastIndexOf('b', 3));
	}
}


// lastIndexOf searching from right to left
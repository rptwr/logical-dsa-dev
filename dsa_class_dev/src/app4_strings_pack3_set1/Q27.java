package app4_strings_pack3_set1;

// Print all the characters in the reverse order through a do-while loop?

public class Q27 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.lastIndexOf(s1.charAt(s1.length() - 1));
//		int i = s1.length() - 1;
		do { 
			System.out.println(s1.charAt(i));
			i--;
		} while(i >= 0);
	}
}

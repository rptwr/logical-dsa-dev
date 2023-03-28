package app4_strings_pack3_set1;

// Print all the characters through a do-while loop?

public class Q21 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = 0;
		do {
			System.out.println(s1.charAt(i));
			i++;
		}
		while(i < s1.length());
	}
}

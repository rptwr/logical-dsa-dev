package app4_strings_pack3_set1;

// Print all the characters from the first space to till to beginning by using do-while loop?
public class Q45 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int index = s1.indexOf(' ');
		do {
			System.out.print(s1.charAt(index));
			index--;
		} while(index >= 0);
	}
}

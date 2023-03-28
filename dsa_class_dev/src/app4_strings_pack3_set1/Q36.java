package app4_strings_pack3_set1;

// Print the characters from the first space to 2nd space through a do-while loop?

public class Q36 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int fSpace = s1.indexOf(' ');
		int sSpace = s1.indexOf(' ', fSpace + 1);
		int i = fSpace + 1;
		do {
			System.out.print(s1.charAt(i) + ", ");
			i++;
		} while(i < sSpace);
	}
}

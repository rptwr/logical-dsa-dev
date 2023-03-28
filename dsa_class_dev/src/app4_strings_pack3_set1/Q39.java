package app4_strings_pack3_set1;
// Print the characters from the 2nd space to 1st space through a do-while loop?
public class Q39 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int fSpace = s1.indexOf(' ');
		int sSpace = s1.indexOf(' ', fSpace + 1);
		int i = sSpace - 1;
		do {
			System.out.print(s1.charAt(i) + ", ");
			i--;
		} while (i > fSpace);
	}
}

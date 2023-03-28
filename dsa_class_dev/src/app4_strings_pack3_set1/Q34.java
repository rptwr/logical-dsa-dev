package app4_strings_pack3_set1;

// Print the characters from the first space to 2nd space through a for loop?
public class Q34 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int fSpace = s1.indexOf(' ');
		int sSpace = s1.indexOf(' ', fSpace + 1);
		for(int i = fSpace + 1; i < sSpace; i++)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

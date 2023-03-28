package app4_strings_pack3_set1;

// Print all the characters from the first space to till to beginning by using for loop?
public class Q43 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int fSpace = s1.indexOf(' ');
		for(int i = fSpace; i >= 0; i--)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

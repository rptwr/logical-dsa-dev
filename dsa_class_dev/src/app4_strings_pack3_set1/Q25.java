package app4_strings_pack3_set1;

// Print all the characters in the reverse order through a for loop?
public class Q25 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.println(s1.charAt(i));
		}
	}
}

package app4_strings_pack3_set1;

// Print all the characters in the reverse order through a while loop?
public class Q26 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.length() - 1;
		while(i >= 0)
		{
			System.out.println(s1.charAt(i));
			i--;
		}
	}
}

package app4_strings_pack3_set1;

// Print the alternative characters from the end to the beginning by using while loop

public class Q49 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int index = s1.length() - 1;
		while(index >= 0)
		{
			System.out.print(s1.charAt(index) + ", ");
			index -= 2;
		}
	}
}

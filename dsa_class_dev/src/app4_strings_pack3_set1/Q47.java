package app4_strings_pack3_set1;

// Print the alternative characters from the beginning to the last by using while loop
public class Q47 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int index = 0;
		while(index < s1.length())
		{
			System.out.print(s1.charAt(index) + ", ");
			index += 2;
		}
	}
}

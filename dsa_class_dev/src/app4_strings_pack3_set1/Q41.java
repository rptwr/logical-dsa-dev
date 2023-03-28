package app4_strings_pack3_set1;

// Print all the characters from the last space to till to end by using while loop?
public class Q41 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int lSpace = s1.lastIndexOf(' ');
		int index = lSpace + 1;
		while(index < s1.length())
		{
			System.out.print(s1.charAt(index) + ", ");
			index++;
		}
	}
}

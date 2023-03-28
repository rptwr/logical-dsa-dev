package app4_strings_pack3_set1;

// Print all the characters from the last space to till to end by using for loop?
public class Q40 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int lSpace = s1.lastIndexOf(' ');
		for(int i = lSpace + 1; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

package app4_strings_pack3_set1;

// Print all the characters from the first space to till to beginning by using while loop?
public class Q44 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int index = s1.indexOf(' ');
		while(index >= 0)
		{
			System.out.print(s1.charAt(index) + ", ");
			index--;
		}
	}
}

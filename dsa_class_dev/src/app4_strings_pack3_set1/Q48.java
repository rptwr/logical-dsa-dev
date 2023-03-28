package app4_strings_pack3_set1;

// Print the alternative characters from the end to the beginning by using for loop
public class Q48 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		for(int i = s1.length() - 1; i >= 0; i -= 2)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

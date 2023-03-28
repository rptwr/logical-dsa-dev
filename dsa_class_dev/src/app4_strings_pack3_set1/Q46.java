package app4_strings_pack3_set1;

// Print the alternative characters from the beginning to the last by using for loop
public class Q46 {	
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		for(int i = 0; i < s1.length(); i += 2)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

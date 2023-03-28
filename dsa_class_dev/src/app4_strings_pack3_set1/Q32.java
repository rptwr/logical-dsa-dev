package app4_strings_pack3_set1;

// Print the 12th index to 3rd index characters through a do-while loop? 
public class Q32 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int i = 12;
		do {
			System.out.print(s1.charAt(i) + ", ");
			i--;
		} while(i >= 3);
	}
}

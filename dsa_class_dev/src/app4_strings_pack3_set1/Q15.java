package app4_strings_pack3_set1;

// Print the first 10 characters through a do while loop? 
public class Q15 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int index = 0;
		do {
			System.out.println(index + ": " + s1.charAt(index));
			index++;
		} while(index < 10);
	}
}

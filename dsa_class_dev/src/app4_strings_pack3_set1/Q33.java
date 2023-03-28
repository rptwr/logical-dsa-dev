package app4_strings_pack3_set1;

  // Print the 12th index to 3rd index characters through a for loop? 
public class Q33 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		for(int i = 12; i >= 3; i--)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}

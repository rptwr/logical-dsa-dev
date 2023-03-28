package app4_strings_pack3_set1;

  // Print the 12th index to 3rd index characters through a while loop? 
public class Q31 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int i = 12;
		while(i >= 3)
		{
			System.out.print(s1.charAt(i) + ", ");
			i--;
		}
	}
}

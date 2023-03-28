package app4_strings_pack2_basics;

//reading from the both end one by one

public class Q13 {
	public static void main(String[] args) {
		String s1 = "abcdefghij";
		//           0123456789
		System.out.println(s1);
		for(int i = 0; i < (s1.length() / 2); i++)
		{
			System.out.print(s1.charAt(i));
			System.out.print(s1.charAt(s1.length() - 1 - i));
		}
	}
}

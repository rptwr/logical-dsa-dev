package app4_strings_pack2_basics;

//read 2nd and last 3rd character 

public class Q9 {
	public static void main(String[] args) {
		String s1 = "abcdefgh";
		//			 01234567
		System.out.println(s1);
		System.out.println("2nd char: " + s1.charAt(1));
		System.out.println("last 3rd char: " + s1.charAt(s1.length() - 3));
	}
}

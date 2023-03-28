package app4_strings_pack2_basics;

//read first character and last character only

public class Q8 {
	public static void main(String[] args) {
		String s1 = "abc xyz";
		System.out.println(s1);
		System.out.println("first char:" + s1.charAt(0));
		System.out.println("last char:" + s1.charAt(s1.length() - 1));
		
	}
}

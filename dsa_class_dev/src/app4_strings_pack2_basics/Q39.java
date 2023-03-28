package app4_strings_pack2_basics;

//reversing a string
public class Q39 
{
	public static void main(String[] args) {
		String s1  = "abcdef";
		System.out.println(s1);
		String s2 = reverse(s1);
		System.out.println(s2);
	}
	static String reverse(String str)
	{
		if(str.length() == 0)
		{
			return "";
		}
		return(str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1)));
	}
}
















//{
//	public static void main(String[] args) {
//		String s1 = "abcdef";
//		System.out.println(s1);
//		String s2 = reverse(s1);
//		System.out.println(s2);
//	}
//
//	static String reverse(String str) {
//		if (str.length() == 0) {
//			return "";
//		}
//		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
//	}
//}

//recursive simple example


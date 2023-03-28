package app4_strings_pack2_basics;

//reading specifier character from a string

public class Q5
{
	public static void main(String[] args) {
		String s1 = "hello abc";
		//           012345678
		char c1 = s1.charAt(7);
		char c2 = s1.charAt(3);
		char c3 = s1.charAt(0);
		char c4 = s1.charAt(5);
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

//reading a specific character

//==================================================================================================
//StringIndexOutOfBoundsException

//{
//	public static void main(String[] args) {
//		String s1 = "hello abc";
//		//			 012345678
//		char c1 = s1.charAt(9);
//		System.out.println(s1);
//		System.out.println(c1);
//	}
//}


//any index number which is not available we will get StringIndexOutOfBoundsException
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
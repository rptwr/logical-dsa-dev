package app4_strings_pack1;

public class Q27 {
//	public static void main(String[] args) {
//		String s1 = "hello";
//		char c1 = 0;
//		for(int i = s1.length() - 1; i >= 0; i--)
//		{
//			c1 = s1.charAt(i);
//			System.out.print(c1 + "");
//		}
//	}
//}

	public static void main(String[] args) {
		String s1 = "hello";
		char[] chars = s1.toCharArray();
		char c1;
		for(int i = chars.length - 1; i >= 0; i--)
		{
			c1 = chars[i];
			System.out.print(c1 + "");
		}
	}
}
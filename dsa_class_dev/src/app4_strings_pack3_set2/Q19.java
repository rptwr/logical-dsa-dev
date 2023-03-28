package app4_strings_pack3_set2;

// Print the 2nd word in the reverse order?
public class Q19 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZSS TEST HELLO";
//		String[] words = s1.split(" ");
//		String s2 = words[1];
//		char[] chars = s2.toCharArray();
//		char temp;
//		for (int i = 0; i < s2.length() / 2; i++) {
//			temp = chars[i];
//			chars[i] = chars[chars.length - 1 - i];
//			chars[chars.length - 1 - i] = temp;
//		}
//		s2 = new String(chars);
//		System.out.println(s2);
//	}
//}


{
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String s2 = "";
		int i = s1.indexOf(' ') + 1;
		for (int j = s1.indexOf(' ', i) - 1; j >= i; j--) {
			s2 += s1.charAt(j);
		}
		System.out.println(s2);
	}
}
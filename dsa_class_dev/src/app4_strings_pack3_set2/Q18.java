package app4_strings_pack3_set2;

// Print the first word in the reverse order?
public class Q18
//{	
//	public static void main(String[] args) {
//		String s1 = "ABC XYZSS TEST HELLO";
//		String[] words = s1.split(" ");
//		String s2 = words[0];
//		String s3 = "";
//		for(int i = s2.length() - 1; i >= 0; i--) {
//			s3 += s2.charAt(i);
//		}
//		System.out.println(s3);
//	}
//}


{
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String[] words = s1.split(" ");
		String s2 = words[0];
		char[] chars = s2.toCharArray();
		char temp;
		for(int i = 0; i < s2.length() / 2; i++) {
			temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		s2 = new String(chars);
		System.out.println(s2);
	}
}
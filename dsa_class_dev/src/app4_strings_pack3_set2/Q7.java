package app4_strings_pack3_set2;

// Find out length of the first word ?
public class Q7
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
////		System.out.println(s1.substring(0, 3));
//		for (int i = 0; i < s1.indexOf(' '); i++) {
//			s2 += s1.charAt(i);
//		}
//		System.out.println(s2.length());
//	}
//}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int i = 0;
//		while(i < s1.indexOf(' ')) {
//			s2 += s1.charAt(i);
//			i++;
//		}
//		System.out.println(s2.length());
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int fWordCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == ' ') {
				break;
			}
			fWordCount++;
		}
		System.out.println(fWordCount);
	}
}

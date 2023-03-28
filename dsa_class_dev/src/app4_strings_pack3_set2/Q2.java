package app4_strings_pack3_set2;

//  Print the first word from the given string?
public class Q2 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int fSpace = s1.indexOf(' ');
//		for (int i = 0; i < fSpace; i++) {
//			s2 += s1.charAt(i);
//		}
//		System.out.println("First word from " + s1 + " is " + s2);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		int  index = 0;
		while(index < s1.indexOf(' ')) {
			s2 += s1.charAt(index);
			index++;
		}
		System.out.println(s2);
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		for(int i = 0; i < s1.indexOf(' '); i++) {
//			s2 += s1.charAt(i);
//		}
//		System.out.println(s2);
//	}
//}

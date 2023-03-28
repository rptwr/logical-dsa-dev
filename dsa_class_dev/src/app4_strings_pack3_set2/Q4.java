package app4_strings_pack3_set2;

// Print the 3rd word from the given string?
public class Q4
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int fSpace = s1.indexOf(' ');
//		int sSpace = s1.indexOf(' ', fSpace + 1) + 1;
//		while(sSpace < s1.indexOf(' ', sSpace)) {
//			s2 += s1.charAt(sSpace);
//			sSpace++;
//		}
//		System.out.println(s2);
//	}
//}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String[] str = s1.split(" ");
//		System.out.println(str[2]);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		int fSpace = s1.indexOf(' ');
		for(int i = s1.indexOf(' ', fSpace + 1) + 1; i < s1.indexOf(' ', i); i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
	}
}

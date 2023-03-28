package app4_strings_pack3_set2;

// Print the last word from the given string?
public class Q5 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String[] lWord = s1.split(" ");
//		System.out.println(lWord[lWord.length - 1]);
//	}
//}


//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int lSpace = s1.lastIndexOf(' ') + 1;
//		while(lSpace < s1.length()) {
//			s2 += s1.charAt(lSpace);
//			lSpace++;
//		}
//		System.out.println(s2);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		for(int i = s1.lastIndexOf(' ') + 1; i < s1.length(); i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
	}
}

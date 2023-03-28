package app4_strings_pack3_set2;

// Print last 2 words?
public class Q22
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZSS TEST HELLO";
//		String[] words = s1.split(" ");
//		System.out.println(words[words.length - 2] + " " + words[words.length - 1]);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String lastTwoWords = "";
		int wordCount =  0;
		for(int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ' ') {
				wordCount++;
			}
			if (wordCount == 2) {
				break;
			}
			lastTwoWords = s1.charAt(i) + lastTwoWords;
//			lastTwoWords += s1.charAt(i);
		}
		System.out.println(lastTwoWords);
	}
}

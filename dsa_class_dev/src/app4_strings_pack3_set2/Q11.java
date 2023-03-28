package app4_strings_pack3_set2;

// Print the words which are having length 3?
public class Q11  
{
	public static void main(String[] args) {
		String s1 =  "ABC XYZ TEST HEL";
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		String word = "";
		while(fromIndex < toIndex) {
			word = s1.substring(fromIndex, toIndex);
			if (word.length() == 3) {
				System.out.println(word);
			}
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
		word = s1.substring(fromIndex);
		if(word.length() == 3) {
			System.out.println(word);
		}
				
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HEL";
//		String[] words = s1.split(" ");
//		for(String word : words) {
//			if(word.length() == 3) {
//				System.out.println(word);
//			}
//		}
//	}
//}



//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HEL";
//		String s2 = "";
//		boolean inWord = false;
//		for (int i = 0; i < s1.length(); i++) {
//			char c = s1.charAt(i);
//			if (c != ' ') {
//				s2 += c;
//				inWord = true;
//			} else if (inWord) {
//				if (s2.length() == 3) {
//					System.out.println(s2);
//				}
//				s2 = "";
//				inWord = false;
//			}
//		}
//		if (inWord && s2.length() == 3) {
//			System.out.println(s2);
//		}
//	}
//}



//{
//	public static void main(String[] args) {
//		String inputString = "ABC XYZ TEST HELLO";
//		int length = inputString.length();
//		StringBuilder currentWord = new StringBuilder();
//
//		// loop through the string and extract words with length 3
//		for (int i = 0; i < length; i++) {
//			char c = inputString.charAt(i);
//			if (c == ' ') {
//				if (currentWord.length() == 3) {
//					System.out.println(currentWord);
//				}
//				currentWord = new StringBuilder();
//			} else {
//				currentWord.append(c);
//			}
//		}
//
//		// check the last word in the string (which has no trailing space)
//		if (currentWord.length() == 3) {
//			System.out.println(currentWord);
//		}
//	}
//}

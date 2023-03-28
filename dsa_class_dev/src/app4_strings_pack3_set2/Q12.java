package app4_strings_pack3_set2;

// Print the words which are having length greater than 3?
public class Q12 {
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String words = "";
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		while(fromIndex < toIndex) {
			words = s1.substring(fromIndex, toIndex);
			if(words.length() > 3) {
				System.out.println(words);
			}
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
		words = s1.substring(fromIndex);
		if(words.length() > 3) {
			System.out.println(words);
		}
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String[] words = s1.split(" ");
//		for (String word : words) {
//			if(word.length() > 3) {
//				System.out.println(word);
//			}
//		}
//	}
//}

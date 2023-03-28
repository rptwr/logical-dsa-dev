package app4_strings_pack3_set2;

// Print the index of the first word’s middle char?
public class Q14 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		int index = 0;
//		String word = "";
//		while (s1.charAt(index) != ' ' && index < s1.length()) {
//			index++;
//		}
//		int middileChar = index / 2;
//		System.out.println(middileChar);
//	}
//}


//{
//	public static void main(String[] args) {
//		String s1 = "ABCDE XYZ TEST HELLO";
//		String s2 = "";
//		for(int i = 0; i < s1.indexOf(' '); i++)
//		{
//			s2 += s1.charAt(i);
//		}
//		int middileChar = s2.length() / 2;
//		System.out.println(middileChar);
//	}
//}




{
	public static void main(String[] args) {
		String s1 = "ABCDE XYZ TEST HELLO";
		String[] words = s1.split(" ");
		if(words.length > 0) {
			String word = words[0];
			int index = word.length() / 2;
			System.out.println(index);
		}
	}
}
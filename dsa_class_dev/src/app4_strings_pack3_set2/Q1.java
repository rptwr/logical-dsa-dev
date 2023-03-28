package app4_strings_pack3_set2;


//Find out the total number of words in the given string?
public class Q1
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		int word = 1;
//		int index = s1.indexOf(' ');
//		while(index != -1) {
//			word++;
//			index = s1.indexOf(' ', index + 1);
//		}
//		System.out.println(word);
//	}
//}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		int index = s1.lastIndexOf(' ');
//		int word = 0;
//		while (index != -1) {
//			word++;
//			index = s1.lastIndexOf(' ', index - 1);
//		}
//		System.out.println(word + 1);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int word = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				word++;
			}
		}
		System.out.println(word + 1);
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String[ ] index = s1.split(" ");
//		int word = index.length;
//		System.out.println(word);
//	}
//}


package app4_strings_pack3_set2;

//  Print the last 2nd word from the given string?
public class Q6 
{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		int lSpace = s1.lastIndexOf(' ') - 1;
		for(int i = s1.lastIndexOf(' ', lSpace) + 1; i <= lSpace; i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String[] sWord = s1.split(" ");
//		System.out.println(sWord[sWord.length - 2]);
//	}
//
//}
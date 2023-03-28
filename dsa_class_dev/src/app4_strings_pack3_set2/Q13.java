package app4_strings_pack3_set2;

//Print the index of the first word’s last char?
public class Q13 
{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int index = 0;
		while(s1.charAt(index) != ' ' && index < s1.length()) {
			index++;
			
		}
		int lastCharIndex = --index;
		System.out.println(lastCharIndex);
	}
}


//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		for(int i = 0; i < s1.indexOf(' '); i++) {
//			s2 += s1.charAt(i);
//			
//		}
//		System.out.println(s2);
//		int i = s2.length() - 1;
//		System.out.println(i);
//	}
//}
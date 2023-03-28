package app4_strings_pack3_set2;

// Find out length of the 2nd word ?
public class Q8 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		int sWordCount = 0;
//		for (int i = s1.indexOf(' ') + 1; i <= s1.indexOf(' ', i); i++) {
//			if (s1.charAt(i) == ' ') {
//				break;
//			}
//			sWordCount++;
//		}
//		System.out.println(sWordCount);
//	}
//}


{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int sWordCount = 0;
		boolean fSpace = false;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == ' ') {
				if(fSpace) {
					break;
				}
				else {
					fSpace = true;
				}
			}
			else if(fSpace) {
				sWordCount++;
			}
		}
		System.out.println(sWordCount);
	}
}

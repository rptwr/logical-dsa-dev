package app4_strings_pack3_set2;

// Find out length of the last word ?

public class Q10
{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int lWordCount = 0;
		for(int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == ' ') {
				break;
			}
			lWordCount++;
		}
		System.out.println(lWordCount);
	}
}

package app4_strings_pack3_set2;

// Print first 2 words?
public class Q21 
{
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String firstTwoWords = "";
		int wordCount = 0;
		for(int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				wordCount++;
			}
			if(wordCount == 2) {
				break;
			}
			firstTwoWords += s1.charAt(i);
		}
		System.out.println(firstTwoWords);
	}
}


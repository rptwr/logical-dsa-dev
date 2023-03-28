package app4_strings_pack3_set2;	

//  Print the index of the 2nd word’s middle char?

public class Q15 {
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String s2 = "";
		for(int i = s1.indexOf(' ') + 1; i < s1.indexOf(' ', i); i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2.length() / 2);
	}
}

package app4_strings_pack3_set2;

// Print the index of the 4th word’s middle char?
public class Q16 {
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String s2 = "";
		for(int i = s1.lastIndexOf(' ') + 1; i < s1.length(); i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2.length() / 2);
	}
}

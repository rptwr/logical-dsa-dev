package app4_strings_pack3_set2;

// Print the last word in the reverse order?
public class Q20 
{
	public static void main(String[] args) {
		String s1 = "ABC XYZSS TEST HELLO";
		String s2 = "";
		for (int i = s1.length() - 1; i > s1.lastIndexOf(' '); i--) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
	}
}

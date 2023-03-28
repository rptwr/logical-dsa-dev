package app4_strings_pack3_set2;

//  Find out length of the 3rd word ?
public class Q9 
{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		int tWordCount = 0;
		for(int i = 0; i < s1.lastIndexOf(' '); i++) {
			s2 += s1.charAt(i);
		}
		System.out.println(s2);
		int j = s2.indexOf(' ') + 1;
		for(int k = s2.indexOf(' ', j) + 1; k < s2.length(); k++) {
			tWordCount++;
		}
		System.out.println(tWordCount);
	}
}

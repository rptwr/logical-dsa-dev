package app4_strings_pack3_set1;

public class Q38 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int fSpace = s1.indexOf(' ');
		int sSpace = s1.indexOf(' ', fSpace + 1);
		int i = sSpace - 1;
		while(i > fSpace)
		{
			System.out.print(s1.charAt(i) + ", ");
			i--;
		}
	}
}

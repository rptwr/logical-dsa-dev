package app4_strings_pack3_set2;

//Print the 2nd word from the given string?
public class Q3 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int index = s1.indexOf(' ') + 1;
//		while(index < s1.indexOf(' ', index)) {
//			s2 += s1.charAt(index);
//			index++;
//		}
//		System.out.println(s2);
//	}
//}

//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		String s2 = "";
//		int fSpace = s1.indexOf(' ');
//		for(int i = fSpace + 1; i < s1.indexOf(' ', i); i++) {
//			s2 += s1.charAt(i);
//		}
//		System.out.println(s2);
//	}
//}


//{
//	public static void main(String[] args) {
//		String s1 = "ABC XYZ TEST HELLO";
//		
//		String[] str = s1.split(" ");
//		System.out.println(str[1]);
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC XYZ TEST HELLO";
		int fSpace = s1.indexOf(' ');
		int sSpace = s1.indexOf(' ', fSpace + 1);
		String sWord = s1.substring(fSpace + 1, sSpace);
		System.out.println(sWord);
	}
}




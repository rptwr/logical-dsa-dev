package app4_strings_pack2_basics;

public class Q28 {
	public static void main(String[] args) {
		String s1 = "abc xyz";
		//           0123456
		int i = s1.indexOf(' ');
		String s2 = s1.substring(0, 3);
		String s3 = s1.substring(4, 7);
		String s4 = s1.substring(1, 5);
		String s5 = s1.substring(i + 1, s1.length());
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}


// for substring method first argument is inclusive second argument is exclusive
// substring method taking two limits
// in order to get a portion of existing string
// by using substring method we can extract a portion of string.



//{
//	public static void main(String[] args) {
//		String s1 = "lara tech";
//		//           0123456789
//		int i = s1.indexOf(' ');
//		String s2 = s1.substring((s1.length() - 1) - i);
//		System.out.println(s2);
//	}
//}

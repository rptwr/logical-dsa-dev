package app4_strings_pack3_set1;

// Find out the index of last space?
public class Q11 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
				//   0123456789
		int i = s1.lastIndexOf(' ');
		System.out.println(i);
	}
}

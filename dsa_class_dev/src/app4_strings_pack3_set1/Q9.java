package app4_strings_pack3_set1;

//  Find out the index of ‘E’?
public class Q9 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.lastIndexOf('E');
		int j = s1.indexOf('E');
		System.out.println(i + ", " + j );
	}
}

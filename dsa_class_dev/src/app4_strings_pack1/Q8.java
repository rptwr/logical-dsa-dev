package app4_strings_pack1;

public class Q8 {
	public static void main(String[] args) {
//		String s1 = "Hello \ java";
		String s1 = "Hello\\java";
		String s2 = "F:\\lara-dev\\logical-coding\\strings-dev";  // address with single backward slash eclipse will change it into double backward slash
		System.out.println(s1.length());
		System.out.println(s1);
	}
}

// We cant not keep backward slash directly 
// in the body of the string we can not keep double quote and backward
//slash directly both required escaping.

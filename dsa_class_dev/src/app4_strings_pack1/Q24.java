package app4_strings_pack1;

public class Q24 {
	public static void main(String[] args) {
		String s1 = "hello";
		s1.concat("test");  // new string is generating hello with test but that is not assigning to s1
		System.out.println(s1); 
	}
}
package java_string;

public class M3 {
	public static void main(String[] args) {
		String s1 = "abc";   // old object remains s1 only
		String s2 = s1.concat("xyz");   // String s2 = s1 + "xyz";
		System.out.println(s1);
		System.out.println(s2);
	}
}


/*
 concat() method is using + operator internally
 
 */
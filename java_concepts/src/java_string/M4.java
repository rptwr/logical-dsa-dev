package java_string;

public class M4 {
	public static void main(String[] args) {
		String s1 = "abc";  
		s1 = s1.concat("xyz");  // s1 = s1 + xyz;
		System.out.println(s1);
	}
}


/*
 String objects are immutable 
s1 pointing to result of s1 + xyz (a mnew object).
 
 
 */
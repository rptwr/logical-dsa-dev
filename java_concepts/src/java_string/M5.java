package java_string;

public class M5 {
	public static void main(String[] args) {
		String s1 = "abc";  
		s1.concat("xyz");  // a new string object is generating // this new object is not assiging back to s1
		System.out.println(s1); // still s1 pinting to abc
	}
}


/*
 s1 pointing to abc only
 
 
 */
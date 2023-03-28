package java_string;

public class M1 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);
		s1 = s1 + "xyz";  // it generates a new string //  new object is creating with the content as abc and xyz
		System.out.println(s1); 
	}
}

// string objects are immutable
// once we create a string object we can not change further.

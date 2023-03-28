package java_string;

public class M7 {
	public static void main(String[] args) {
		String s1 = "abc xyz  hello";  
		s1.replace("abc", "test");  // whole abc is getting replaced with the test
		System.out.println(s1);
	}
}


/*
whenever you are trying to modify a new object object is generating
new object is not assinging back to s1



 */
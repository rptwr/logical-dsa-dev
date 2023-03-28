package java_string;

public class M13 {
	public static void main(String[] args) {
		String s1 = null;  // null is a default literal to any derived data type
		String s2 = s1 + null;
		String s3 = null + s1;
		String s4 = s1 + s1;
//		String s5 = null + null;    // no string concatination  or mathematical addition
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		System.out.println(s5);
		
	}
}


/*

+ operator require any one operand as string
+ operator is used for mathematical addition or string cocatination

 */
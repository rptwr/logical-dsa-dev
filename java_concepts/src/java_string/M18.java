package java_string;

public class M18 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "java";
		String s4 = s1 + "va";
		String s5 = "ja" + s2;
		String s6 = "ja" + "va";
		String s7 = s1 + s2;
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s7);
		System.out.println("-----------");
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
		System.out.println("------------");
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println("-------------");
		System.out.println(s6 == s7);
		
	}
}


// if any one operand is ref var it uses new operator  (s4, s5, s7 ) uses new operator
// s3 and s6 both are pointing to constant pool object
// s4, s5, s7 is creating with a new operator

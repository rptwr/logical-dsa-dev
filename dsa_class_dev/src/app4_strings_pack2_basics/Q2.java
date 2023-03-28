package app4_strings_pack2_basics;

//how to keep double quotation inside a string

public class Q2 
{
	public static void main(String[] args) {
//		String s1 = "Mr. "Vijay", how are you?";  // keeping vijay under double quotation
		String s1 = "Mr. \"Vijay\", how are you?";
		String s2 = "Hello \"\" ";
		String s3 = "java\"\"";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}


//inside a string we can not keep double quotation.
//it should e escaped with a backward slash(\)
package java_string;

public class M2 {
	public static void main(String[] args) {
		String s1 = " abc ";
		System.out.println(s1 + ":" + s1.length());
		s1 = s1.trim();  // while calling trim() a new string object will be creating because leading a trailing string object will be generating
		System.out.println(s1 + ":" + s1.length());
	}
}
// trim () method removes leading and trailing white dpaces // while removing , adding, erplacing
// a new string objects generate

// initially s1 pointing to 5 character string
// after trimming its pointing to 3 char string while 
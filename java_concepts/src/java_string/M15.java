package java_string;

public class M15 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); //if s and s2 pointng to same object returning true ==(double equal operator it won't check the content it checks only memory location)
		System.out.println(s1.equals(s2));   // same content
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());  // hashcode() returns integer umber
	}
}


// object class equals() method and hashcode() method both got overrided// both are checking the content

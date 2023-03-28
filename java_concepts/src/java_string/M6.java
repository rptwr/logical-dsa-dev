package java_string;

public class M6 {
	public static void main(String[] args) {
		String s1 = " abc xyz ";  
		s1.trim();  // new object is generating that we are not assigning to any ref
		System.out.println(s1.length());
	}
}


/*
String objects are immutable
 we can not do the changes in the same object  
 while doing the changes a new object is generating
 
 */
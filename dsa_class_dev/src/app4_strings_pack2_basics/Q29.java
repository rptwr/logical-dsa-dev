package app4_strings_pack2_basics;

// substring

public class Q29 {
	public static void main(String[] args) {
		String s1 = "lara tech";
				//   012345678
		
		String s2 = s1.substring(0, 0);
		String s3 = s1.substring(6, 6);
		String s4 = s1.substring(1, 1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}


// if both the number are same we will get empty string because second argument prefered more
//
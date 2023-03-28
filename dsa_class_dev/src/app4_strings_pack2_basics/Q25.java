package app4_strings_pack2_basics;

// lastIndexOf(char)

public class Q25 {

	public static void main(String[] args) {
		String s1 = "abc abc abc abc";
		//           012345789
		System.out.println(s1.lastIndexOf('a', 7));
		System.out.println(s1.lastIndexOf('c', 3));

	}

}

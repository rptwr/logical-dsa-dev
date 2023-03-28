package app4_strings_pack2_basics;


public class Q15 {
	public static void main(String[] args) {
		String s1 = "abc xyz pqr";
				//   0123456789
		int a = s1.indexOf('a');
		int b = s1.indexOf('b');
		int c = s1.indexOf('c');
		int d = s1.indexOf('x');
		int e = s1.indexOf('y');
		int f = s1.indexOf('z');
		int g = s1.indexOf('w');
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}

// if any character is not available we will get -1
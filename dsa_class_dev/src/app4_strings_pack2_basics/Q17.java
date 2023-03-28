package app4_strings_pack2_basics;


public class Q17 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 0));
		System.out.println(s1.indexOf('a', 1));
		System.out.println(s1.indexOf('a', 2));
		System.out.println(s1.indexOf('b', 1));  // from 1 index onwards its searching // supplied value is inclusive
	}
}


// supplied value inclusive in case of search
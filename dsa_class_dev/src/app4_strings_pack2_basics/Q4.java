package app4_strings_pack2_basics;

//reading character by character a string

public class Q4 {
	public static void main(String[] args) {
		String s1 = "hello";
		//           01234
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
	}
}

//Returns the char value at the specified index. An index ranges from 0 to length() - 1.
//The first char value of the sequenceis at index 0, the next at index 1,and so on, 
//as for array indexing. 
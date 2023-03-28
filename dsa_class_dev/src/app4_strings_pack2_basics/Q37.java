package app4_strings_pack2_basics;

// reverse a String

public class Q37 
{
	public static void main(String[] args) {
		String s1 = "hello java";
		System.out.println(s1);
		String s2 = "";
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
	}
}


// through String concatenation we can reverse a string 
// not recomonded
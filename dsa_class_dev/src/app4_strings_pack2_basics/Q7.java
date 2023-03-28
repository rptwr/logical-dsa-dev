package app4_strings_pack2_basics;

//reading all character in the reverse order
//from a string by using length() and charAt() methods

public class Q7
{
	public static void main(String[] args) {
		String s1 = "abc xyz";
		//           0123456
		System.out.println(s1);
		for(int i = s1.length() - 1; i >= 0; i--)
		{
			System.out.println(s1.charAt(i));
		}
		
	}
}


//we are just reading content of string in the reverse order
//string is not modified s1 remains same.


//reversing a string means reversing the content of string its different logic
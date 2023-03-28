package app4_strings_pack2_basics;

//reading all character from a string by using length() and charAt() methods

public class Q6 
{
	public static void main(String[] args) {
		String s1 = "hello abc";
				//   012345678
		System.out.println(s1);
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
	}
}


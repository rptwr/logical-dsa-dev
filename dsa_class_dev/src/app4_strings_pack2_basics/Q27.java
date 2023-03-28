package app4_strings_pack2_basics;

// nearest end to particular character in a given string

public class Q27 
{
	public static void main(String[] args) {
		String s1 = "hello abc test";
				//   0123456789
		char word = 's';
		int leftEnd = s1.indexOf(word);
		int rightEnd = s1.length() - s1.lastIndexOf(word);
		if(leftEnd <  rightEnd)
		{
			System.out.println(word + " is nearer to left end");
		}
		else
		{
			System.out.println(word + " is nearer to right side");
		}
	}
}

package app4_strings_pack2_basics;

// read word by word from given string which contains multiple words

public class Q30 
{
	public static void main(String[] args) {
		String s1 = "abc xyz 123 tuv pqr";
		//           0123456789
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		String word;
		while(toIndex != -1)
		{
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
}

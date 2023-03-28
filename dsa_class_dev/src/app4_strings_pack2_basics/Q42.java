package app4_strings_pack2_basics;

//reversing a string by  white spaces
public class Q42

{
	public static void main(String[] args) {
		String s1 = "abc bc c";
				//   01234567
		String s2 = "";
		for(int i = 0, j = s1.length() - 1; j >= 0; j--, i++)
		{
			if(s1.charAt(i) == ' ')
			{
				s2 += ' ';
				j++;
				continue;
			}
			if(s1.charAt(j) != ' ')
			{
				s2 += s1.charAt(j);
			}
			else
			{
				i--;
			}
		}
		System.out.println(s2);
	}
}














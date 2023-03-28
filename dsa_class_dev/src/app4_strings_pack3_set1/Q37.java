package app4_strings_pack3_set1;
//Print the characters from the 2nd space to 1st space through a for loop?
public class Q37 
{
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		//           0123456789
		int fSpace = s1.indexOf(' ');
		int sSpcae = s1.indexOf(' ', fSpace + 1);
		for(int i = sSpcae - 1; i > fSpace; i--)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}


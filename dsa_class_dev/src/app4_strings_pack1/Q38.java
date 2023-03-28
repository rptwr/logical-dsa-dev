package app4_strings_pack1;

public class Q38 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello test 123 java";
		String[] strings = s1.split(" ");
		for(String string : strings)
		{
			System.out.println(string);
		}
	}
}




// built-in method not recomonded in interview
// in projects we can use split
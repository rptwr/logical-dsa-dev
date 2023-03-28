package app4_strings_pack1;

public class Q30 {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("initial:" + s1);
		s1 = reverse(s1);
		System.out.println("final:" + s1);
	}
	static String reverse(String s1)
	{
		if(s1.length() == 1)
		{
			return s1;
		}
		return s1.charAt(s1.length() - 1) + reverse(s1.substring(0, s1.length() -1));
	}
}


// printing string in reverse using recursion
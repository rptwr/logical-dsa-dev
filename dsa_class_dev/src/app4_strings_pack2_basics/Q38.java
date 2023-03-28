package app4_strings_pack2_basics;

// reverse a string using recursion

public class Q38 
{
	static String s2 = "";
	public static void main(String[] args) {
		String s1 = "abcdef";
		System.out.println(s1);
		reverse(s1);
		System.out.println(s2);
	}
	static void reverse(String str)
	{
		if(str.length() == 0)
		{
			return;
		}
		s2 += str.charAt(str.length() - 1);
		reverse(str.substring(0, str.length() - 1));
		
	}
}




// recursion is nothing but calling same method
// in recursive there are multiple ways -- 

// interviewers are excepting through
// there is another recursive approach without gloabl s2 -- best approach for interview
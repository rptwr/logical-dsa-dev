package app4_strings_pack2_basics;


import java.util.Scanner;
//consider all the brackets  [, {, (, <
public class Q45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a line of chars");
		String s1 = sc.nextLine();
		String s2 = "";
		char ch;
		boolean status = false;
		for (int i = 0; i < s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
			{
				s2 = s2 + ch;
			}
			if(ch == ')' || ch == ']' || ch == '}' || ch == '>')
			{
				status = s2.length() == 0 ? false :  compare(s2.charAt(s2.length() - 1), ch);
			if (status)
			{
				s2 = s2.substring(0, s2.length() - 1);
			}
			else
			{
				break; 
			}
		}
		}
		System.out.println(s2.length() == 0 && status ? "balanced" : "not balanced"); 	
	}
	static boolean compare(char c1, char c2) {
		return (c1 == '(' && c2 == ')') ||
				 (c1 == '[' && c2 == ']')||
				 (c1 == '{' && c2 == '}') ||
				 (c1 == '<' && c2 == '>');
		
	}

}
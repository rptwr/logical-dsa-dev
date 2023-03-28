package app4_strings_pack2_basics;

import java.util.Scanner;

/*
 balencing bracks in the given string
 
 (abc) ==> balanced
 test (hello) 123 ==> balanced
 (test (hello) 12)3 ==> balanced
 (test (hello 12)3 ==> no balance
 (test 123 ==> not balanced 
 test 123) ==> not balanced
 (((te)st 123)) ==> balanced
 (((test 123))) ==> balanced
 (((t)e)st 123) ==> balanced
 
 // if left parenthisis is same as right parenthisis then = its balanced
 
 */

public class Q43 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars ");
		String s1 = sc.nextLine();
		int openBracketsCount = 0, closeBracketsCount = 0;
		char ch;
		for(int i = 0; i < s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(ch == '(')
			{
				openBracketsCount ++;
			}
			if(ch == ')')
			{
				closeBracketsCount ++;
			}
		}
		System.out.println(openBracketsCount == closeBracketsCount ? "balanced" : "not balanced");
		
	}
}


//=============================================================================================================================


//{
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter an input to check the balancing");
//		String s1 = sc.next();
//		String brackets = "({[<>]})";
//		String stack = "";  // stack is empty
//		char c1;
//		int index;
//		boolean balanced = true;  
//		for(int i = 0; i < s1.length(); i++)  
//		{
//			c1 =  s1.charAt(i);
//			index = brackets.indexOf(c1);
//			if(index != -1)
//			{
//				if(index <= 3)
//				{
//					stack += c1;
//				}
//				else if(stack.length() != 0 && compareSymetric(c1, stack.charAt(stack.length() - 1)))
//				{
//					stack = stack.substring(0, stack.length() - 1);
//				}
//				else
//				{
//					balanced = false;
//					break;
//				}
//			}
//		}
//		System.out.println(stack.length() == 0 && balanced ? "balanced" : "not balanced");
//	}
//	static boolean compareSymetric(char closing, char opening)
//	{
//		return (opening == '(' && closing == ')') ||
//			   (opening == '[' && closing == ']') ||
//			   (opening == '{' && closing == '}') ||
//			   (opening == '<' && closing == '>');
//	}
//}


//=====================================================================================================

//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter some bracket");
//		String s1 = sc.nextLine();
//		System.out.println(isValid(s1));
//	}
//
//	static boolean isValid(String s1) {
//		Stack<Character> stack = new Stack<>();
//		for (char c1 : s1.toCharArray()) {
//			if (c1 == '(' || c1 == '{' || c1 == '[' || c1 == '<') {
//				stack.push(c1);
//			} else if (stack.isEmpty()) {
//				return false;
//			} else {
//				char top = stack.peek();
//				if ((c1 == ')' && top == '(') || (c1 == '}' && top == '{') || (c1 == ']' && top == '[')
//						|| (c1 == '>' && top == '<')) {
//					stack.pop();
//				} else {
//					return false;
//				}
//			}
//		}
//		return stack.isEmpty();
//	}
//}

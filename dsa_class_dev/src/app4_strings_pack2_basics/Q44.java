package app4_strings_pack2_basics;

import java.util.Scanner;

/*
   checking balencing brackets in the given string
   here order of brackets laso matter
   
 (abc) ==> balanced
 test [hello] 123 ==> balanced
 (test [hello] 12)3 ==> balanced
 (test [hello 12)3] ==> not balance
 (test [hello 12)3) ==> not balance
 (test (hello 12)3] ==> not balance
 (test [hello (12)3]) ==>  balance
 ([123]) ==> balanced
 (([123])) ==> balanced
 ([((123))]) ==> balanced
 ([(((123))))] ==> not balanced
 [(((123)))]) ==> not balanced
 
 closing should be type of immediate opening type
 
*/

//public class Q44 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("pls enter a line of words ");
//		String s1 = sc.nextLine();
//		String s2 = "";
//		char ch;
//		boolean status = false;
//		for(int i = 0; i < s1.length(); i++)
//		{
//			ch = s1.charAt(i);
//			if(ch == '(' || ch == '[')
//			{
//				s2 = s2 + ch;
//			}
//			if(ch == ')' || ch == ']')
//			{
//				status = compare(s2.charAt(s2.length() - 1), ch);
//				break;
//			}
//			else
//			{
//				break;
//			}
//		}
//		System.out.println(status ? "balanced" : "not balanced");
//	}
//
//	 static boolean compare(char c1, char c2) {
//		// TODO Auto-generated method stub
//		return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']');
//	}
//}


import java.util.Scanner;
/*
checking balancing bracket in the given String
(abc)  ==> balanced
test[hello]123  ==> balanced
(test [hello] 12)3  ==> balanced
[test (hell)o 12]3  ==> balanced
(test [hello 12)3]  ==> not balanced
(test [hello 12)3)  ==> not balanced
(test (hello 12)3]) ==> not balanced
(test [hello (12)3])==> balanced
([123]) ==> balanced
(([123])) ==> balanced
([((123)))] ==> not balanced      //order also important here
[(((123))]) ==> not balanced
*/
public class Q44 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a line of chars");
		String s1 = sc.nextLine();
		String s2 = "";
		char ch;
		boolean status = false;
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			if (ch == '(' || ch == '[') 
			{
				s2 = s2 + ch;
			}
			if (ch == ')' || ch == ']')
			{
				status = s2.length() == 0 ? false :  compare(s2.charAt(s2.length() - 1), ch);     //)))abc .. to avoid out of bound exception we are using >> s2.length() == 0 ? false :
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
		System.out.println(s2.length() == 0 && status ? "balanced" : "not balanced"); 				//  (((abc)  to correct this type of cases ...we are using s2.length() == 0 &&
	}

	static boolean compare(char c1, char c2) {
		return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']');
	}
}

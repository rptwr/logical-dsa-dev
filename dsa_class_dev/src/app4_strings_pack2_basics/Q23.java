package app4_strings_pack2_basics;

import java.util.Scanner;

// find out all occurances of 2nd string in the first string

public class Q23 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter line of words");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		int count = 0;
		int i = s2.indexOf(s2);
		while(i != -1)
		{
			count ++;
			i = s1.indexOf(s2, i + 1);
		}
		System.out.println(s2 + " is available " + count + " times" );
	}
}






//{
//	public static void main(String[] args) {
//		if(args.length < 2)
//		{
//			System.out.println("pls enter two string args");
//			return;
//		}
//		String s1 = args[0];
//		String s2 = args[1];
//		System.out.println("given string: ");
//		System.out.println("first one: " + s1);
//		System.out.println("2nd one: " + s2);
//		int count = 0;
//		int i = s2.indexOf(s2);
//		String occurances = "";
//		while(i != -1)
//		{
//			count ++;
//			occurances += i + ", ";
//			i = s1.indexOf(s2, i + 1);
//		}
//		System.out.println(s2 + " is available in " + count + "times(" + occurances + ")");
//	}
//}

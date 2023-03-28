package app4_strings_pack2_basics;

import java.util.Scanner;
/*
 * check weather 2nd String is a rotate of first String or not??
 * examples 
 * abc  , cab  , bca
 * hello, olleh, lohel, 
 */
public class Q52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String");
		String s1 = sc.next();
		System.out.println("enter second String");
		String s2 = sc.next();
		sc.close();
		boolean isRotate = checkRotate(s1, s2);
		System.out.println(s1 + " is Rotate of " + s2 + " : " + isRotate);
	}
	static boolean checkRotate(String s1, String s2)
	{
		boolean flag = false;
		if(s1.length() != s2.length())
		{
			return flag;
		}
		if((s1 + s1).indexOf(s2) != -1)
		{
			flag = true;
		}
		return flag;
	}
}
package app3_arrays_pack4;

import java.util.Scanner;
//How do you check whether a string is a palindrome in java?
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = reverse(s);
		if(s.endsWith(s))
		{
			System.out.println("string is pandrom");
		}else
		{
			System.out.println("string is not pandrom");
		}
	}
	static String reverse(String s)
	{
		if(s.length()==1)
		{
			return s;
		}
		return s.charAt(s.length()-1) +reverse(s.substring(0,s.length()-1));
	}
}

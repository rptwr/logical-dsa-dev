package app4_strings_pack2_basics;

import java.util.Scanner;

public class Q21
{
	public static void main(String[] args) {
		String s1 = "Hello java, How are you?";
		
		String s2 = "java";
		int i = s1.indexOf(s2);
		if(i != -1)
		{
			System.out.println(s2 + " is available at " + i);
		}
		else
		{
			System.out.println(s2 + " is not available at");
		}
	}
}





//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a string");
//		String s1 = sc.nextLine();
//		String vowels = "aeiou";
//		char vowel;
//		int index, count;
//		for(int i = 0; i < vowels.length(); i++)
//		{
//			count = 0;
//			vowel = vowels.charAt(i);
//			index = s1.indexOf(vowel);
//			while(index != -1)
//			{
//				count ++;
//				index = s1.indexOf(vowel, index + 1);
//			}
//		}
//		System.out.println(vowel + "dddddd" + count);
//	}
//}

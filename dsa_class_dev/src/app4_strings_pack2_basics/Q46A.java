package app4_strings_pack2_basics;

import java.util.Scanner;

//Find out first repeated character  // second approach

public class Q46A  
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars ");
		String s1 = sc.nextLine();
		char c1 = s1.charAt(0);
		boolean repeated = false;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			if(s1.indexOf(c1, i + 1) != -1)
			{
				repeated = true;
				break;
			}
		}
		System.out.println(repeated ? "first repeadted: " + c1 : "no repeated chars: " + s1);
				
	}
}

//{
//	public static void main(String[] args) {
//		String s1 = "javvvvv";
//				//   01234567
//		int i = s1.indexOf('a');
//		System.out.println(i);
//		int j = s1.indexOf('a', i + 1);
//		System.out.println(j);
//	}
//}
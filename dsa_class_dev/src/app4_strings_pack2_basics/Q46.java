package app4_strings_pack2_basics;

import java.util.Scanner;

// Find out first repeated character

public class Q46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars ");
		String s1 = sc.nextLine();
		char c1 = s1.charAt(0);
		boolean repeated = false;
		loop1:
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			for(int j = i + 1; j < s1.length(); j++)
			{
				if(c1 == s1.charAt(j))
				{
					repeated = true;
					break loop1;
				}
			}
		}
		System.out.println(repeated ? "first repeadted: " + c1 : "no repeated chars: " + s1);
				
	}
}

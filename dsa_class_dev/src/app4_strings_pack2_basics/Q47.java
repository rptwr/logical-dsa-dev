package app4_strings_pack2_basics;

import java.util.Scanner;

//Find out first non repeated character

public class Q47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars ");
		String s1 = sc.nextLine();
		char c1 = '\u0000';
		boolean repeated = false, nonRepeated = false;
		for(int i = 0; i < s1.length(); i++)
		{
			repeated = false;
			c1 = s1.charAt(i);
			for(int j = 0; j < s1.length(); j++)
			{
				if(i != j &&  c1 == s1.charAt(j))
				{
					repeated = true;
				}
			}
			if(!repeated)
			{
				nonRepeated = true;
				break;
			}
		}
		System.out.println(nonRepeated ? "first non repeadted: " + c1 : "no repeated chars in: " + s1);				
	}
}

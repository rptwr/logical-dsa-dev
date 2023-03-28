package app4_strings_pack2_basics;

import java.util.Scanner;

// find out given string are anagrams or not?
/*
 anagaram are: abc, cba, bca
 			   hello, hlloe, oelhl, lohel
 			   
 **/

public class Q48 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter first string ");
		String s1 = sc.next();
		System.out.println("pls enter 2nd string ");
		String s2 = sc.next();
		
		String temp = s2;
		char c1;
		int index;
		boolean anagramStatus = true;
		for(int i = 0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);
			index = s2.indexOf(c1);
			if(index == -1)
			{
				anagramStatus = false;
				break;
			}
			temp = temp.substring(0, index) + temp.substring(index + 1, temp.length());
		}
		if(temp.length() != 0)
		{
			anagramStatus = false;
		}
		System.out.println(anagramStatus ? "both are anagarm" : "both are not anagram");
	}
}


//=========================================

package app4_strings_pack2_basics;

import java.util.Scanner;
// find out two given chars are same or not without considering the case(uppercase or lowercase).
// dont use toUpperCase() and toLowerCase() method
// A a are same
// S s are same
// R, R are same
// T , Q are not same
/*
 	A-> 65
 	Z-> 91
 	
 	a -> 97
 	z -> 122
 * */

public class Q49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls eneter first char");
		char c1 = sc.next().charAt(0);
		System.out.println("pls eneter second char");
		char c2 = sc.next().charAt(0);
		int index1 = (c1 >= 'A' && c1 <= 'Z') ? (c1 - 'A') : (c1 - 'a');  // c1 - uppercase we are finding the difference between c1 character and asci code
		int index2 = (c2 >= 'A' && c2 <= 'Z') ? (c2 - 'A') : (c2 - 'a');
		if(index1 == index2)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
	}
}


// uppercase and lowercase diff are same
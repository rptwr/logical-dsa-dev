package app3_arrays_pack4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = Q4.reverse(s);//see method on q4 code
		System.out.println(rev);
		
	}
}

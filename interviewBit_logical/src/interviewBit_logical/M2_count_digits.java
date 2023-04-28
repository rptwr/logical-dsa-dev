package interviewBit_logical;

// Write a program in Java to count the digits in a number.

import java.util.Scanner;

public class M2_count_digits {
	
	private static int countDigits(int n) {
		if (n == 0) return 1;
		
		//if negative number is entered 
		if (n < 0) n = -n;
		
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The number of digits in " + n + " are: "
				+ countDigits(n));
	}

}

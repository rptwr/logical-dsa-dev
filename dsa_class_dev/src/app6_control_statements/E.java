package app6_control_statements;

import java.util.Scanner;

// WAP to check for even or odd

public class E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
}
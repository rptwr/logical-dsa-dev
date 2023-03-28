package app6_control_statements;

import java.util.Scanner;

// WAP to print the table of any number

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(num + "* " + i + " = " + num * i );
		}
	}
}

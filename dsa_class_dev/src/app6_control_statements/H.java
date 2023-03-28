package app6_control_statements;

import java.util.Scanner;

// Getting user input (using scaner class)

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.next();

		System.out.println("Enter Gender");
		char gender = sc.next().charAt(0);
		
		System.out.println("Enter Age ");
		int age = sc.nextInt();
		
		System.out.println("Enter phone number ");
		long pn = sc.nextLong();
		
		System.out.println("Name " + name);
		System.out.println("gender " + gender);
		System.out.println("Age " + age);
		System.out.println("Phone number " + pn);
		sc.close();
	}
}

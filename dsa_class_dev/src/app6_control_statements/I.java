package app6_control_statements;

import java.util.Scanner;

// WAP to create calculator using switch case

public class I
//{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter second number ");
//		int num2 = sc.nextInt();
//		System.out.println("Enter symbol +,-,*,/");
//		String symbol = sc.next();
//		int result;
//		switch(symbol)
//		{
//		case"+": result = num1 + num2;
//		System.out.println("Addition is " + result);
//		break;
//		
//		case"-": result = num1 - num2;
//		System.out.println("Subtraction is " + result);
//		break;
//		
//		case"*": result = num1 * num2;
//		System.out.println("Multiplicatin is " + result);
//		break;
//		
//		case"/": result = num1 / num2;
//		System.out.println("Devide is " + result);
//		break;
//		
//		}
//	}
//}

//=============================================================================================

{
	public static void main(String[] args) {
		String yn;
		do {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter first number ");
				int num1 = sc.nextInt();
				System.out.println("Enter second number ");
				int num2 = sc.nextInt();
				System.out.println("Enter symbol +,-,*,/");
				String symbol = sc.next();
				int result;
				switch(symbol)
				{
					case"+": result = num1 + num2;
					System.out.println("Addition is " + result);
					break;
					
					case"-": result = num1 - num2;
					System.out.println("Subtraction is " + result);
					break;
					
					case"*": result = num1 * num2;
					System.out.println("Multiplicatin is " + result);
					break;
					
					case"/": result = num1 / num2;
					System.out.println("Devide is " + result);
					break;
				
				}
				System.out.println("do you want to continue y/n ?");
				yn = sc.next();
		}while(yn.equals("y") || yn.equals("Y"));
	}

}
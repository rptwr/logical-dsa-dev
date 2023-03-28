package app6_control_statements;

//Decision Making statements

public class A

//==================Simple if statement==========================
//{
//	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;
//		int z = x + y;
//		if(z > 20)
//		{
//			System.out.println("z is greater than 20");
//		}
//	}
//}

//=============== if-else statement=================================
//{
//	public static void main(String[] args) {
//		int x = 10;
//		int y = 20;
//		if(x + y < 20)
//		{
//			System.out.println("x + y is less than 20");
//		}
//		else {
//			System.out.println("x + y is greater than 20");
//		}
//	}
//}

//=============if-else-if ladder:=========================================

//{
//	public static void main(String[] args) {
//		String city = "Delhi";
//		if (city == "Meerut") {
//			System.out.println("city is meerut");
//		} else if (city == "Noida") {
//			System.out.println("city is noida");
//		} else if (city == "Agra") {
//			System.out.println("city is agra");
//		} else {
//			System.out.println(city);
//		}
//	}
//}

//=================Nested if-statement=======================================
//{
//	public static void main(String[] args) {
//		String address = "Delhi, India";
//
//		if (address.endsWith("India")) {
//			if (address.contains("Meerut")) {
//				System.out.println("Your city is Meerut");
//			} else if (address.contains("Noida")) {
//				System.out.println("Your city is Noida");
//			} else {
//				System.out.println(address.split(",")[0]);
//			}
//		} else {
//			System.out.println("You are not living in India");
//		}
//	}
//}

//========================Java Switch Statement============================================

{
	public static void main(String[] args) {
		// Declaring a variable for switch expression
		int number = 20;
		// Switch expression
		switch (number) {
		// Case statements
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		// Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}
}
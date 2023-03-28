package app3_arrays_pack1;
import java.util.Scanner;
class B
{
	public static void main(String[] args)
	{
		System.out.println("Taking input from user:");
		Scanner sc = new Scanner(System.in);  //object of scanner class
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum of teo number is:" );
		System.out.println(sum);
	}
}

//import java.util.Scanner;
//class B
//{
//	public static void main(String[] args)
//	{
//		Scanner scanner = new Scanner(System.in);
//		String myString = scanner.next();
//		int myInt = scanner.nextInt();
//		//scanner.close();
//
//		System.out.println("myString is: " + myString);	
//		System.out.println("myInt is: " + myInt);
//	}
//}


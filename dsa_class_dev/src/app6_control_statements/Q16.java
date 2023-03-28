package app6_control_statements;

// WAP to Print Fibonacci Series 

public class Q16 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3 = 2;
		for(int i = 0; i <= 10; i++)
		{
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}

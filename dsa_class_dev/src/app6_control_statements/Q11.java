package app6_control_statements;

// WAP to reverse a number

public class Q11 {
	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0, remainder;
		while(num != 0)
		{
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}

package app6_control_statements;

// WAP to find out number is prime or not

public class Q14 {
	public static void main(String[] args) {
		int num = 4, temp = 0;
		for(int i = 2; i <= num - 1; i++)
		{
			if(num % i == 0)
			{
				temp = temp + 1;
			}
		}
		if(temp > 0)
		{
			System.out.println("number is not prime");
		}
		else {
			System.out.println("number is prime");
		}
	}
}

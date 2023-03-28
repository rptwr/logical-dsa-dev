package number_system_dev;
import java.util.Scanner; 
class A9 
{
	public static void main(String[] args) 
	{
    System.out.println("pls enter int number");
	Scanner sc = new Scanner(System.in);
	
	int num1 = sc.nextInt();
		int count = 0;
		while (num1 != 0)
		{
			count++;
			num1 = num1 / 10;
		}
		System.out.println(count);
	}
}

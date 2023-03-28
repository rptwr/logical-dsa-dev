package app6_control_statements;

//=============WAP to find the larger of two numbers=============================================

public class D 
//{
//	public static void main(String[] args) {
//		int num1 = 10, num2 = 20;
//		if(num1 > num2)
//		{
//			System.out.println("num1 is larger " + num1);
//		}
//		else 
//		{
//			System.out.println("num2 is larger " + num2);
//		}
//	}
//}


//=================WAP to find the larger of three numbers=======================================

//{
//	public static void main(String[] args) {
//		int a = 2, b = 10, c = 30;
//		if(a > b && a > c)
//		{
//			System.out.println("a is greater");
//		}
//		else if(b > a && b > c)
//		{
//			System.out.println(" b is greater");
//		}
//		else
//		{
//			System.out.println(" c is greater");
//		}
//	}
//} 

////=================WAP to find the larger of three numbers=======================================

{
	public static void main(String[] args) {
		int a = 3, b = 2, c = 4;
		if(a > b)
		{
			if(a > c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b > c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
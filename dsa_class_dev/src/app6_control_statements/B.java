package app6_control_statements;

//Loop statements

public class B 

//========================Java for loop=============================================

//{
//	public static void main(String[] args) {
//		int sum = 0;
//		for(int i = 1; i <= 10; i++)
//		{
//			sum = sum + i;
//		}
//		System.out.println("Sum of first 10 natural number is: " + sum);
//	}
//}

//============================== for-each loop====================================================

//{
//	public static void main(String[] args) {
//		String[] names = {"java", "cpp", "python", "c", "js"};
//		System.out.println("Printing the content of the array names:\n");   
//		for(String s1 : names)
//		{
//			System.out.println(s1);
//		}
//	}
//}

//================================= while loop=================================================

//{
//	public static void main(String[] args) {
//		int i = 0;
//		System.out.println("Printing the list of first 10 even numbers \n");  
//		while(i <= 10)
//		{
//			System.out.println(i);
//			i = i + 2;
//		}
//	}
//}


//===============================do-while loop=====================================================

{
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Printing the list of first 10 even number \n");
		do {
			System.out.println(i);
			i = i + 2;
		}while(i <= 10);
	}
}
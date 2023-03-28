package app6_control_statements;

//Jump Statements

public class C

//========================= break statement===========================================

//{
//	public static void main(String[] args) {
//		for(int i = 0; i <= 10; i++)
//		{
//			System.out.println(i);
//			if(i == 6)
//			{
//				break;
//			}
//		}
//	}
//}

//=========================== break statement======================================================

//{
//
//	public static void main(String[] args) {
//		a: 
//		for (int i = 0; i <= 10; i++) 
//		{
//			b: 
//			for (int j = 0; j <= 15; j++) 
//			{
//				c: 
//				for (int k = 0; k <= 20; k++) 
//				{
//					System.out.println(k);
//					if (k == 5) 
//					{
//						break a;
//					}
//				}
//			}
//		}
//	}
//
//}

//=============================continue statement============================================

{
	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) 
		{
			for (int j = i; j <= 5; j++) 
			{
				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}
	}
}
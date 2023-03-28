package app2_display_pattern_pack1;

//0
//0 0
//0 1 0
//0 2 1 0
//0 3 2 1 0
//0 4 3 2 1 0
//0 5 4 3 2 1 0
//0 0 0 0 0 0 0 0

public class Q38 
{
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 1 || i == 8 || j == 1 || j == i)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print((i - j) + " ");
				}
			}
			System.out.println();
		}
	}
}

//{
//	public static void main(String[] args) {
//		for(int i = 1; i <= 8; i++)
//		{
//			for(int j = i; j >= 1; j--)
//			{
//				if(i == 1 || i == 8 || j == 1 || j == i)
//				{
//					System.out.print(0 + " ");
//				}
//				else
//				{
//					System.out.print((j - 1) + " ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}

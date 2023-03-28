package app2_display_pattern_pack1;

//P
//Q P
//R 0 P
//S 0 0 P
//T 0 0 0 P

public class Q50 
//{
//	public static void main(String[] args) {
//		for(char i = 'P'; i <= 'T'; i++)
//		{
//			for(char j = 'P'; j <= i; j++)
//			{
//				if(j == 'P')
//				{
//					System.out.print(i + " ");
//				}
//				else if(j == i)
//				{
//					System.out.print("P");
//				}
//				else
//				{
//					System.out.print(0 + " ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}

{
	public static void main(String[] args) {
		for(char i = 'P'; i <= 'T'; i++)
		{
			for(char j = i; j >= 'P'; j--)
			{
				System.out.print(j == 'P' || j == i ? j + " " : 0 + " ");
			}
			System.out.println();
		}
	}
}

package app2_display_pattern_pack2;

//1 2 3 4 3 2 1
//2 3 4 5 4 3 2
//3 4 5 6 5 4 3
//4 5 6 7 6 5 4
//5 6 7 8 7 6 5

public class Q15 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 7; j++)
			{
				if(j <= 4)
				{
					System.out.print(i + j - 1 + " ");
				}
				else
				{
					System.out.print(7 + i - j + " ");
				}
			}
			System.out.println();
		}
	}
}

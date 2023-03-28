package app2_display_pattern_pack2;

//0 0 0 0 0 0 0 0
//0 1 2 3 4 5 0
//0 1 2 3 4 0
//0 1 2 3 0
//0 1 2 0
//0 1 0
//0 0
//0

public class Q5 {
	public static void main(String[] args) {
		for(int i = 8; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 8 || j == 1 || i == j)
				{
					System.out.print(0 + " ");
				}					
				else
				{
					System.out.print((j - 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
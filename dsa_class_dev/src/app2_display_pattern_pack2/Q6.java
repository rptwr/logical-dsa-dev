package app2_display_pattern_pack2;

//0 0 0 0 0 0 0 0
//0 5 4 3 2 1 0
//0 4 3 2 1 0
//0 3 2 1 0
//0 2 1 0
//0 1 0
//0 0
//0

public class Q6 {
	public static void main(String[] args) {
		for(int i = 8; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
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

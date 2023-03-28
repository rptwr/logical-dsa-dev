package app2_display_pattern_pack2;

//9 8 7 6 0 0 0 0 
//8 7 6 0 0 0 0 0 
//7 6 0 0 0 0 0 0 
//6 0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 0

public class Q13 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 9; j >= 2; j--)
			{
				if((j - i + 1) > 5)
				{
					System.out.print((j - i + 1) + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

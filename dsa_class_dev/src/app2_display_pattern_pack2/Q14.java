package app2_display_pattern_pack2;

//0 9 8 7 6 5 4 3 2 1
//0 0 8 7 6 5 4 3 2 1
//0 0 0 7 6 5 4 3 2 1
//0 0 0 0 6 5 4 3 2 1
//0 0 0 0 0 5 4 3 2 1
//0 0 0 0 0 0 4 3 2 1
//0 0 0 0 0 0 0 3 2 1
//0 0 0 0 0 0 0 0 2 1
//0 0 0 0 0 0 0 0 0 1

public class Q14 {
	public static void main(String[] args) {
		for(int i = 9; i >= 1; i--)
		{
			for(int j = 10; j >= 1; j--)
			{
				if(j > i)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}

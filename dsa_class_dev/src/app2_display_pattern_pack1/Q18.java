package app2_display_pattern_pack1;

//0 0 0 0 0 0
//0 4 3 2 1 0
//0 4 3 2 1 0
//0 4 3 2 1 0
//0 4 3 2 1 0
//0 4 3 2 1 0
//0 0 0 0 0 0

public class Q18 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 6; j >= 1; j--)
			{
				if(i == 1 || i == 7 || j == 1 || j == 6)
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
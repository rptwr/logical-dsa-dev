package app2_display_pattern_pack1;

/*
0 0 0 0 0 0
0 1 2 3 4 0
0 2 3 4 5 0
0 3 4 5 6 0
0 4 5 6 7 0
0 0 0 0 0 0
*/

public class Q17 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				if(i == 1 || i == 6 || j == 1 || j == 6)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print((i + (j - 3)) + " ");
				}
			}
			System.out.println();
		}
	}
}
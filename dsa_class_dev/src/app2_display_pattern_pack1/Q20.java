package app2_display_pattern_pack1;

/*
0 0 0 0 0 0 
0 4 3 2 1 0 
0 3 2 1 1 0 
0 2 1 1 1 0 
0 1 1 1 1 0 
0 0 0 0 0 0 
*/

public class Q20 {
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
					System.out.print(((8 - i - j) > 0 ? (8 - i - j) : 1) + " ");
				}
			}
			System.out.println();
		}
	}
}

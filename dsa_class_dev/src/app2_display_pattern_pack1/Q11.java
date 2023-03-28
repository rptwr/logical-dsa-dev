package app2_display_pattern_pack1;

/*
7 6 5 4 3
7 6 5 4 3
7 6 5 4 3
7 6 5 4 3 
7 6 5 4 3 
7 6 5 4 3
*/

public class Q11 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 7; j >= 3; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

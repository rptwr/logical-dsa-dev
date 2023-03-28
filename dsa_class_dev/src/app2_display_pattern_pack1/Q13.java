package app2_display_pattern_pack1;

/*
7 6 5 4 3 2 1
8 7 6 5 4 3 2
9 8 7 6 5 4 3 
*/

public class Q13 {
	public static void main(String[] args) {
		for(int i = 7; i <= 9; i++)
		{
			for(int j = i; j >= (i - 6); j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

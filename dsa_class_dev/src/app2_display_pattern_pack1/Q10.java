package app2_display_pattern_pack1;

/*
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
*/

public class Q10 {
	public static void main(String[] args) {
		for(int i = 6; i >= 1; i--)
		{
			for(int j = 7; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

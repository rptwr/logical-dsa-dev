package app2_display_pattern_pack1;

/*
1 2 3 4 5 6 
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
*/

public class Q9 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

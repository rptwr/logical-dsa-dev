package app2_display_pattern_pack1;

/*
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
*/

public class Q8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 8; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

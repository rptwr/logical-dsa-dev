package app2_display_pattern_pack1;

/*
3 3 3 3 
2 2 2 2 
1 1 1 1 
*/

public class Q7 {
	public static void main(String[] args) {
		for(int i = 3; i >= 1; i--)
		{
			for(int j = 1; j <= 4; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

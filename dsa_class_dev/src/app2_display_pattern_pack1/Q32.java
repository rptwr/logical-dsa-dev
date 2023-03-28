package app2_display_pattern_pack1;

//9
//9 8
//9 8 7
//9 8 7 6
//9 8 7 6 5
//9 8 7 6 5 4
//9 8 7 6 5 4 3
//9 8 7 6 5 4 3 2
//9 8 7 6 5 4 3 2 1

public class Q32 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 9; j >= (10 - i); j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

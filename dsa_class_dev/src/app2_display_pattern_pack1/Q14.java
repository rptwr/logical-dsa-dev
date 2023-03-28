package app2_display_pattern_pack1;

/*
7 6 5 4 3 
6 5 4 3 2 
5 4 3 2 1
*/

public class Q14 {
	public static void main(String[] args) {
		for(int i = 7; i >= 5; i--)
		{
			for(int j = i; j >= (i - 4); j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

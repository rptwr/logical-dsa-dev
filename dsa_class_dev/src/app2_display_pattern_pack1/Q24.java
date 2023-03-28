package app2_display_pattern_pack1;

/*
F F F F F F
E E E E E E
D D D D D D
C C C C C C
B B B B B B
A A A A A A
*/

public class Q24 {
	public static void main(String[] args) {
		for(char i = 'F'; i >= 'A'; i--)
		{
			for(char j = 1; j <= 7; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

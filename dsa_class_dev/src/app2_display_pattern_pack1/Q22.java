package app2_display_pattern_pack1;

/*
A A A A A A A
B B B B B B B 
C C C C C C C
D D D D D D D
E E E E E E E 
*/

public class Q22 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'E'; i++)  // internally its incrementing ASCI code
		{
			for(char j = 1; j <= 7; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

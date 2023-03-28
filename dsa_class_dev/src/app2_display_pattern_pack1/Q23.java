package app2_display_pattern_pack1;

/*
A B C D E F
B C D E F G
C D E F G H
D E F G H I
E F G H I J
F G H I J K
*/

public class Q23 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F'; i++)
		{
			for(char j = i; j <= i + 5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

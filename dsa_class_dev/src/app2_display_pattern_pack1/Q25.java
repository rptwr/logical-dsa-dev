package app2_display_pattern_pack1;

/*
F E D C B A
G F E D C B
H G F E D C
I H G F E D
J I H G F E
*/

public class Q25 {
	public static void main(String[] args) {
		for(char i = 'F'; i <= 'J'; i++)
		{
			for(char j = i; j >= i - 5; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

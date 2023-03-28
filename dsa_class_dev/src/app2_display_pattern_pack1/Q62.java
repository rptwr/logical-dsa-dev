package app2_display_pattern_pack1;

//A B C D E
//A B C D
//A B C
//A B 
//A

public class Q62 {
	public static void main(String[] args) {
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = 'A'; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

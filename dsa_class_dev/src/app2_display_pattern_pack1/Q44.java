package app2_display_pattern_pack1;

//A
//A B
//A B C
//A B C D
//A B C D E
//A B C D E F
//A B C D E F G

public class Q44 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'G'; i++)
		{
			for(char j = 'A'; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

package app2_display_pattern_pack1;

//P Q R S T
//P Q R S
//P Q R
//P Q
//P

public class Q67 {
	public static void main(String[] args) {
		for(char i = 'T'; i >= 'A'; i--)
		{
			for(char j = 'P'; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

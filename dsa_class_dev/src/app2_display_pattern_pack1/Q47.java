package app2_display_pattern_pack1;

//P
//P Q
//P Q R
//P Q R S
//P Q R S T
//P Q R S T U
//P Q R S T U V

public class Q47 {
	public static void main(String[] args) {
		for(char i = 'P'; i <= 'V'; i++)
		{
			for(char j = 'P'; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

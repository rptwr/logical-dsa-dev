package app2_display_pattern_pack1;

//P
//O P
//N O P
//M N O P
//L M N O P
//K L M N O P

public class Q48 {
	public static void main(String[] args) {
		for(char i = 'P'; i >= 'K'; i--)
		{
			for(char j = i; j <= 'P'; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

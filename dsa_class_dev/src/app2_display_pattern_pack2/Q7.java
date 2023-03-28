package app2_display_pattern_pack2;

//A C E G I K
//A C E G I
//A C E G 
//A C E 
//A C 
//A

public class Q7 {
	public static void main(String[] args) {
		for(char i = 'K'; i >= 'A'; i -= 2)
		{
			for(char j = 'A'; j <= i; j += 2)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

package app2_display_pattern_pack2;

//P
//Q P
//R Q P
//S R Q P
//T S R Q P
//U T S R Q P
//V U T S R Q P
//W V U T S R Q P

public class Q12 {
	public static void main(String[] args) {
		for(char i = 'P'; i <= 'W'; i++)
		{
			for(char j = i; j >= 'P'; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

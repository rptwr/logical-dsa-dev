package app2_display_pattern_pack1;

//P
//P Q
//P 0 R
//P 0 0 S
//P 0 0 0 T
//P 0 0 0 0 U
//P 0 0 0 0 0 V

public class Q49 {
	public static void main(String[] args) {
		for(char i = 'P'; i <= 'V'; i++)
		{
			for(char j = 'P'; j <= i; j++)
			{
				if(j == 'P')
				{
					System.out.print("P ");
				}
				else if(j == i)
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

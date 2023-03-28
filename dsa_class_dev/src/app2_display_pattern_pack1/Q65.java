package app2_display_pattern_pack1;

//P P P P P 
//Q Q Q Q
//R R R
//S S 
//T

public class Q65 {
	public static void main(String[] args) {
		for(char i = 'P'; i <= 'T'; i++)
		{
			for(char j = i; j <= 'T'; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

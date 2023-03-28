package app2_display_pattern_pack1;

//T T T T T
//S S S S
//R R R
//Q Q 
//P

public class Q66 {
	public static void main(String[] args) {
		for(char i = 'T'; i >= 'P'; i--)
		{
			for(char j = i; j >= 'P'; j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

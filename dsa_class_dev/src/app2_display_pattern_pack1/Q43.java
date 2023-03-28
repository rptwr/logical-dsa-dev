package app2_display_pattern_pack1;

//A 
//B B
//C C C
//D D D D
//E E E E E 
//F F F F F F

public class Q43 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F'; i++)
		{
			for(char j = 'A'; j <= i; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

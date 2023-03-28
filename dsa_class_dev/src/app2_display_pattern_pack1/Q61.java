package app2_display_pattern_pack1;

//A A A A A A 
//B B B B B
//C C C C
//D D D
//E E 
//F

public class Q61 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F'; i++)
		{
			for(char j = i; j <= 'F'; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

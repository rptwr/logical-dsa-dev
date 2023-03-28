package app2_display_pattern_pack1;

//E E E E E E
//D D D D
//C C C
//B B 
//A

public class Q63 {
	public static void main(String[] args) {
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = i; j >= 'A'; j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}

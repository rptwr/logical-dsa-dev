package app2_display_pattern_pack1;

//A
//B A
//C B A
//D C B A
//E D C B A
//F E D C B A

public class Q45 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F'; i++)
		{
			for(char j = i; j >= 'A'; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

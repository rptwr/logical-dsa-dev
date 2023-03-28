package app2_display_pattern_pack1;

//P
//P P
//P P P
//P P P P
//P P P P P
//P P P P P P

public class Q46 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("P ");
			}
			System.out.println();
		}
	}
}

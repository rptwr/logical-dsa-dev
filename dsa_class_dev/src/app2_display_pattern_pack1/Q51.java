package app2_display_pattern_pack1;

//1 1 1 1 1 1
//1 1 1 1 1
//1 1 1 1
//1 1 1
//1 1 
//1

public class Q51 {
	public static void main(String[] args) {
		for(int i = 6; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
}
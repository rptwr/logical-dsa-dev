package app2_display_pattern_pack1;

//1
//1 1
//1 1 1
//1 1 1 1
//1 1 1 1 1
//1 1 1 1 1 1
//1 1 1 1 1 1 1

public class Q26 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
}

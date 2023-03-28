package app2_display_pattern_pack1;

//0 0 0 0 0 0
//0 4 3 2 1 0
//0 5 4 3 2 0
//0 6 5 4 3 0
//0 7 6 5 4 0
//0 8 7 6 5 0
//0 0 0 0 0 0

public class Q19 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				if(i == 1 || i == 7 || j == 1 || j == 6)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(i - j + 4 + " ");
				}
			}
			System.out.println();
		}
	}
}

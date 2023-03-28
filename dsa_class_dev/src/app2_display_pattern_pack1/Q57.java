package app2_display_pattern_pack1;

//0 0 0 0 0 0
//0 3 2 1 0
//0 2 1 0
//0 1 0
//0 0 
//0

public class Q57 {
	public static void main(String[] args) {
		for(int i = 6; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 6 || j == 1 || i == j)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print((i - j) + " ");
				}
			}
			System.out.println();
		}
	}
}
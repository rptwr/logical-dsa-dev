package app2_display_pattern_pack1;

//0
//0 1
//0 1 2
//0 1 2 3
//0 1 2 3 4
//0 1 2 3 4 5
//0 1 2 3 4 5 6

public class Q39 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j == 1)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print((j - 1) + " ");
				}
			}
			System.out.println();
		}
	}
}

package app2_display_pattern_pack1;

//0 0 0 0 0 0
//0 1 2 3 0
//0 1 2 0
//0 1 0
//0 0 
//0

public class Q56 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = i; j <= 6; j++)
			{
				if(i == 1 || j == 6 || i == j)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print((j - i) + " ");
				}
			}
			System.out.println();
		}
	}
}

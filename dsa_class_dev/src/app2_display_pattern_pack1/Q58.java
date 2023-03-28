package app2_display_pattern_pack1;

//0 0 0 0 0
//1 2 3 0
//1 2 0
//1 0 
//0

public class Q58 {
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 5 || i == j)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}

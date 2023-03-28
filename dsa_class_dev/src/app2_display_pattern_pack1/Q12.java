package app2_display_pattern_pack1;

/*
1 2 3 4 5 6 7 
2 3 4 5 6 7 8 
3 4 5 6 7 8 9
*/

public class Q12 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 3; i++)
		{
			for(int j = i; j <= (i + 6); j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

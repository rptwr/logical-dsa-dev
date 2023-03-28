package app2_display_pattern_pack1;

//0
//6 0
//5 6 0
//4 5 6 0
//3 4 5 6 0
//2 3 4 5 6 0
//1 2 3 4 5 6 0

public class Q41 {
	public static void main(String[] args) {
		for(int i = 7; i >= 1; i--)
		{
			for(int j = i; j <= 7; j++)
			{
				if(j != 7)
				{
					System.out.print(j + " ");
				}
				else
				{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

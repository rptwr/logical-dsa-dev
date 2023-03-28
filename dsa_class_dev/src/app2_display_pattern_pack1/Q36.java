package app2_display_pattern_pack1;

//0
//0 0
//0 1 0
//0 1 1 0
//0 1 1 1 0
//0 1 1 1 1 0
//0 1 1 1 1 1 0
//0 1 1 1 1 1 1 0
//0 0 0 0 0 0 0 0 0


public class Q36 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 1 || i == 9 || j == 1 || j == i)
				{
					System.out.print(0 + " ");
				}
				else
				{
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
	}
}

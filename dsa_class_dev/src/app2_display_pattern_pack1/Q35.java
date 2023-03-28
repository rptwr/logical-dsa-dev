package app2_display_pattern_pack1;

//1
//1 1
//1 0 1
//1 0 0 1
//1 0 0 0 1
//1 0 0 0 0 1
//1 0 0 0 0 0 1
//1 1 1 1 1 1 1 1

public class Q35 {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i == 1 || i == 8 || j == 1 || j == i)
				{
					System.out.print(1 + " ");
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

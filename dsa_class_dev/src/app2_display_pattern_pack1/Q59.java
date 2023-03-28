package app2_display_pattern_pack1;

//0 0 0 0 0
//3 2 1 0
//2 1 0
//1 0 
//0

public class Q59 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				if(i == 1 || i == j)
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

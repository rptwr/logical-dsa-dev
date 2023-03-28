package app2_display_pattern_pack1;

 
public class Q71 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j >= i)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

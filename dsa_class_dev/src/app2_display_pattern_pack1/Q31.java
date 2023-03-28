package app2_display_pattern_pack1;

//9
//8 9
//7 8 9
//6 7 8 9
//5 6 7 8 9
//4 5 6 7 8 9

public class Q31 {
	public static void main(String[] args) {
		for(int i = 9; i >= 4; i--)
		{
			for(int j = i; j <= 9; j++)
			{
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
}
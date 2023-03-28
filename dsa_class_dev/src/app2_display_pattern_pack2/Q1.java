package app2_display_pattern_pack2;

//1 3 5 7 9
//1 3 5 7
//1 3 5
//1 3
//1

public class Q1 {
	public static void main(String[] args) {
		for(int i = 9; i >= 1; i -= 2)
		{
			for(int j = 1; j <= i; j += 2)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

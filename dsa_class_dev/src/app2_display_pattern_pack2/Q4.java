package app2_display_pattern_pack2;

//2 4 6 8
//2 4 6
//2 4
//2

public class Q4 {
	public static void main(String[] args) {
		for(int i = 8; i >= 2; i -= 2)
		{
			for(int j = 2; j <= i; j += 2)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

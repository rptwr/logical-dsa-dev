package app2_display_pattern_pack2;

//8 6 4 2
//6 4 2
//4 2
//2

public class Q3 {
	public static void main(String[] args) {
		for(int i = 8; i >= 2; i -= 2)
		{
			for(int j = i; j >= 2; j -= 2)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

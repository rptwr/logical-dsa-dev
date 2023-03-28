package app2_display_pattern_pack2;

//9 7 5 3 1
//7 5 3 1
//5 3 1
//3 1
//1

public class Q2 {
	public static void main(String[] args) {
		for(int i = 9; i >= 1; i -= 2)
		{
			for(int j = i; j >= 1; j -= 2)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

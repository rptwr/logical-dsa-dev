package app2_display_pattern_pack2;

//Don’t use any extra variables. Only two are allowed
//9 1  8 2  7 3  6 4  5 5  4 6  3 7  2 8  1 9
//9 1  8 2  7 3  6 4  5 5  4 6  3 7  2 8 
//9 1  8 2  7 3  6 4  5 5  4 6  3 7
//9 1  8 2  7 3  6 4  5 5  4 6  
//9 1  8 2  7 3  6 4  5 5   
//9 1  8 2  7 3  6 4  
//9 1  8 2  7 3  
//9 1  8 2
//9 1

public class Q8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 9; j >= i; j--)
			{
				System.out.print(j + " ");
				System.out.print((10 - j) + " ");
			}
			System.out.println();
		}
	}
}
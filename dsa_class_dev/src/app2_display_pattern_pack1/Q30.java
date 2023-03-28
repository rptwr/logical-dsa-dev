package app2_display_pattern_pack1;

//0
//1 2 
//3 4 5 
//6 7 8 9 

public class Q30 {
	public static void main(String[] args) {
		int k = 0;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(k++  + " ");
			}
			System.out.println();
		}
	}
}
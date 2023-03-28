package app2_display_pattern_pack1;

//A 
//A A
//A A A
//A A A A
//A A A A A
//A A A A A A

public class Q42 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("A" + " ");
			}
			System.out.println();
		}
	}
}

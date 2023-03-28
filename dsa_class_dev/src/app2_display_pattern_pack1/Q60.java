package app2_display_pattern_pack1;

//A A A A A A
//A A A A A
//A A A A
//A A A
//A A 
//A

public class Q60 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F'; i++)
		{
			for(char j = i; j <= 'F'; j++)
			{
				System.out.print("A" + " ");
			}
			System.out.println();
		}
	}
}

package app2_display_pattern_pack1;

//E D C B A
//D C B A
//C B A
//B A 
//A

public class Q64 {
	public static void main(String[] args) {
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(char j = i; j >= 'A'; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

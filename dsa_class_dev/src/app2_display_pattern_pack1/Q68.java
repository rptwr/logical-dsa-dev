package app2_display_pattern_pack1;

//L M N O P
//Q R S T
//U V W
//X Y 
//Z

public class Q68 {
	public static void main(String[] args) {
		char ch = 'L';
		for(char i = 'L'; i <= 'P'; i--)
		{
			for(char j = i; j <= 'P'; j++)
//			for(int j = 1;j<=i;j++)
			{
				
				System.out.print(ch++ + " ");
//				a++;
			}
			System.out.println();
		}
	}
}

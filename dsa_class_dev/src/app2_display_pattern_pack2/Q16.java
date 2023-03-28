package app2_display_pattern_pack2;

//A B C D C B A
//B C D E D C B
//C D E F E D C
//D E F G F E D
//E F G H G F E

public class Q16 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(char j = 'A'; j <= 'G'; j++)
			{
				if(j <= 'D')
				{
					System.out.print((char)i + (char)j - 'A' + " ");
				}
				else
				{
					System.out.print('G' + (char)i - (char)j + " ");
				}
				System.out.println();
			}
		}
	}
}

package app2_display_pattern_pack2;

//H G F E D C B A 
//G F E D C B A 
//F E D C B A 
//E D C B A 
//D C B A 
//C B A 
//B A 
//A

public class Q11 {
	public static void main(String[] args) {
		for(char i = 'H'; i >= 'A'; i--)
		{
			for(char j = i; j >= 'A'; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

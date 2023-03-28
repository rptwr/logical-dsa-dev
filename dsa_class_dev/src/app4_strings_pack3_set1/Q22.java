package app4_strings_pack3_set1;

// Print the last 10 characters through a while loop?
public class Q22 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.length() - 1;
		int count = 0;
		while(i > 0)
		{
			System.out.println(s1.charAt(i));
			count ++;
			i--;
			if(count == 10)
			{
				break;
			}
		}
	}
}

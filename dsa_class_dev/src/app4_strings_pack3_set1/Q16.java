package app4_strings_pack3_set1;

// Print the first 10 characters through a for loop but except white spaced?

public class Q16 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int count = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			if(c1 != ' ')
			{
				System.out.println(c1);
				count++;
			}
			if(count == 10)
			{
				break;
			}
		}
	}
}

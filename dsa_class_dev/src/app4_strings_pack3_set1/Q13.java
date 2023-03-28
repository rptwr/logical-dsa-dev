package app4_strings_pack3_set1;

// Print the first 10 characters through a for loop?
public class Q13 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		
//		for(int i = 0; i < 10; i++)
		for(int i = 0; i < s1.length() - 1; i++)
		{
			if(i < 10)
			{
				System.out.println(i + ":" + s1.charAt(i));
			}
		}
	}
}

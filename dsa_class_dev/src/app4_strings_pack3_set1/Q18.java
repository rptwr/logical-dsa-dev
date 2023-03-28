package app4_strings_pack3_set1;

// Print the first 10 characters through a do while loop but except white spaced?

public class Q18 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = 0;
		int count = 0;
		do {
			char c1 = s1.charAt(i);
			if(c1 != ' ')
			{
				System.out.println(c1);
				count ++;
			}
			i++;
		} while(i < s1.length() && count < 10);
	}
}

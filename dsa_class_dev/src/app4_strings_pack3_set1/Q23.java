package app4_strings_pack3_set1;

// Print the last 10 characters through a do while loop?
public class Q23 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int count = 0;
		int i = s1.length() - 1;
		do { 
			System.out.println(s1.charAt(i));
			count++;
			if(count == 10)
			{
				break;
			}
			i--;
		} while(i > 0);
	}
}

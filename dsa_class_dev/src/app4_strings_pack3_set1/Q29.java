package app4_strings_pack3_set1;

// Print the last 10 characters in the reverse order through a do while loop? 

public class Q29 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.length() - 1;
		int count = 0;
		do { 
			System.out.print(s1.charAt(i) + ", ");
			count ++;
//			if(count == 10)
//			{
//				break;
//			}
			i--;
		} while(i >= 0 && count < 10);
	}
}

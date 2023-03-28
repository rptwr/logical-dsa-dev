package app4_strings_pack3_set1;

// Print the first 10 characters through a while loop?
public class Q14 {
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		
		int index = 0;
		while(index < 10)
		{
			System.out.println(index + ": " + s1.charAt(index));
			index++;
		}
	}
}

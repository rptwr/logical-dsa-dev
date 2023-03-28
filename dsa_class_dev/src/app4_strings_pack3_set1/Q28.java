package app4_strings_pack3_set1;

// Print the last 10 characters in the reverse order through a while loop? 
public class Q28 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC DEGHG IJKLMN";
//		int i = s1.length() - 1;
//		int count = 0;
//		while(i >= 0)
//		{
//			System.out.println(s1.charAt(i));
//			i--;
//			count++;
//			if(count == 10)
//			{
//				break;
//			}
//		}
//	}
//}

{
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = s1.length() - 1;
		int count = 0;
		while(i > 0 && count < 10)
		{
			System.out.println(s1.charAt(i));
			count++;
			i--;
		}
	}
}
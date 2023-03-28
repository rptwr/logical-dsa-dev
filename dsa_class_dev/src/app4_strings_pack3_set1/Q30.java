package app4_strings_pack3_set1;

// Print the last 10 characters in the reverse order through a for loop?
public class Q30 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC DEGHG IJKLMN";
//		int count = 0;
//		for(int i = s1.length() - 1; i >= 0; i--)
//		{
//			System.out.print(s1.charAt(i) + ", ");
//			count ++;
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
		int len = s1.length() - 1;
		for(int i = len; i >= 0 && i >= len - 10; i--)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}
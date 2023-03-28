package app4_strings_pack3_set1;

// Print the last 10 characters through a for loop? 
public class Q24 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC DEGHG IJKLMN";
//		int count = 0;
//		for(int i = s1.length() - 1; i >= 0; i--)
//		{
//			System.out.println(s1.charAt(i));
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
		for(int i = s1.length() - 1, count = 0; i > 0 && count < 10; i--, count++)
		{
			System.out.print(s1.charAt(i) + ", ");
		}
	}
}
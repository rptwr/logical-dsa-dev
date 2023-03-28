package app4_strings_pack3_set1;

// Print the first 10 characters through a while loop but except white spaced? 

public class Q17 
//{
//	public static void main(String[] args) {
//		String s1 = "ABC DEGHG IJKLMN";
//		int index = 0;
//		int count = 0;
//		while(index < s1.length())
//		{
//			if(s1.charAt(index) != ' ')
//			{
//				System.out.println(s1.charAt(index));
//				count++;
//			}
//			if(count == 10)
//			{
//				break;
//			}
//			index++;
//		}
//	}
//}

//==================================================================

{
	public static void main(String[] args) {
		String s1 = "ABC DEGHG IJKLMN";
		int i = 0;
		int count = 0;
		while(i < s1.length() && count < 10)
		{
			char c1 = s1.charAt(i);
			if(c1 != ' ')
			{
				System.out.println(c1);
				count++;
			}
			i++;
		}
	}
}
package app4_strings_pack2_basics;

// reversing a string

public class Q36 
{
	public static void main(String[] args) {
		String s1 = "abcdef";
		char[] chars = s1.toCharArray();
		char temp;
		for(int i = 0; i < chars.length / 2; i++)
		{
			temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		s1 = new String(chars);
		System.out.println(s1);
	}
}














//{
//	public static void main(String[] args) {
//		String s1 = "abcdef";
//		char[] chars = s1.toCharArray();
//		// 			{'a', 'b', 'c', 'd', 'e', 'f'}
//				//    0    1    2     3    4   5  ---> chars.length is 6
//		char temp;
//		for(int i = 0; i < chars.length / 2; i++)
//		{
//			temp = chars[i];
//			chars[i] = chars[chars.length - 1 - i];
//			chars[chars.length - 1 - i] = temp;
//		}
//		s1 = new String(chars);
//		System.out.println(s1);
//	}
//}


//reversing an array -- swap first with last element swap second with second last so on
//inside array length is property not method












//{
//	public static void main(String[] args) {
//		String s1 = "abc xyz";
//				//   0123456
//		char[] chars = s1.toCharArray();
//		char temp;
//		for(int i = 0; i < chars.length / 2; i++)
//		{
//			temp = chars[i];
//			chars[i] = chars[chars.length - 1 - i];
//			chars[chars.length - 1 - i] = temp;
//		}
//		s1 = new String(chars);
//		System.out.println(s1);
//	}
//}



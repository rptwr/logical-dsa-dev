package app4_strings_pack2_basics;

//find out vowel in the string

public class Q18 
//{
//	public static void main(String[] args) {
//		String s1 = "hello java, how are you??";
//		for(int i  =0; i < s1.length(); i++)
//		{
//			char ch = s1.charAt(i);
//			if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u')
//			{
//				System.out.println(ch + "is  a vowel");
//			}
//			
//		}
//	}
//}

//===========================================================================================================


{
	public static void main(String[] args) {
		String s1 = "hello java, how are you??";
		String vowels = "aeiou";
		char vowel;
		int index, count;
		for(int i = 0; i < vowels.length(); i++)
		{
			count = 0;
			vowel = vowels.charAt(i);
			index = s1.indexOf(vowel);
			while(index != -1)
			{
				count ++;
				index = s1.indexOf(vowel, index + 1);
			}
			if(count != 0)
			{
				System.out.println(vowel + " available in string " + count + " times");
			}
		}
	}
}






/**
* Indexing is used in Java programming to access specific elements in an array or a 
* collection, such as a list or a string. By using an index, you can easily retrieve or
*  modify a specific element within the array or collection, rather than having to search
*   through the entire data structure. Additionally, indexing allows for efficient searching
*    and sorting of data, as well as the ability to quickly access a specific subset of data
*/
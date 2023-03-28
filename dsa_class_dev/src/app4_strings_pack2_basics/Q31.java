package app4_strings_pack2_basics;

// read word by word in reverse order

import java.util.Scanner;

public class Q31 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new line of word");
		String s1 = sc.nextLine();
		int fromIndex = s1.lastIndexOf(' ');
		int toIndex = s1.length();
		String word;
		while(fromIndex != -1)
		{
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word);
			toIndex = fromIndex;
			fromIndex = s1.lastIndexOf(' ', toIndex - 1);
		}
		System.out.println(s1.substring(0, toIndex));
	}
}

//qwe pqr wer
//0123456789
package app4_strings_pack2_basics;


import java.util.Scanner;

// wheather given string is panagram or not
/*
 if string containing every alphabet from A - Z// it can be uppercase or lowercase
 * */
public class Q50
//{
//	public static boolean isPangram(String str) {
//		boolean[] mark = new boolean[26];
//		int index = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
//				index = str.charAt(i) - 'A';
//			} 
//			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
//				index = str.charAt(i) - 'a';
//			}
//			mark[index] = true;
//		}
//		for (int i = 0; i <= 25; i++) {
//			if (mark[i] == false) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String ");
//		String str = sc.nextLine();
//		if (isPangram(str)) {
//			System.out.println("The string is a pangram.");
//		} else {
//			System.out.println("The string is not a pangram.");
//		}
//
//	}
//}


//	public static boolean isPangram(String str) {
//		boolean[] mark = new boolean[26];
//		int index = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
//				index = str.charAt(i) - 'A';
//			} 
//			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
//				index = str.charAt(i) - 'a';
//			}
//			mark[index] = true;
//		}
//		for (int i = 0; i <= 25; i++) {
//			if (mark[i] == false) {
//				return false;
//			}
//		}
//		return true;
//	}



{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter line of chars");
        String s1 = sc.nextLine();
        boolean [] alphabetStatus = new boolean[26];
        char c1;
        int index = 0;
        for(int i = 0 ; i < s1.length() ; i++)
        {
            c1 = s1.charAt(i);
            if('A' <= c1 && c1 <= 'Z')
            {
                index = c1 - 'A';
            } else if ('a' <= c1 && c1 <= 'z') {
                index = c1 - 'a';
            }
            else
            {
                continue;
            }
            alphabetStatus[index] = true;
        }
        boolean isPanagram = true;
        for(int i = 0; i < alphabetStatus.length; i++)
        {
            if(alphabetStatus[i] == false)
            {
                isPanagram = false;
                break;
            }
        }
        System.out.println(isPanagram ? "yes it's a panagram " : "no it's not a panagram");

    }
}


//  if c is avl index will be true all the char reading in s1 array
// from 0 onwards 26 we are keep on checking
// we are running a boolean array if any place is false the it will be not panagram


// to make a panagram which character is missed charactr // assignment


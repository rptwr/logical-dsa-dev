package app4_strings_pack2_basics;

//Find out the given string is panagram or not.
//a String which contains all alphabets in any case is panagram.
import java.util.Scanner;
//panagram
public class Q51 {
	 @SuppressWarnings("resource")
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
	        String missedChars = "";
	         c1 = '\u0000';
	        for(int i = 0; i < alphabetStatus.length; i++)
	        {
	        	if(alphabetStatus[i] == false)
	        	{
	        		c1 = (char) ('A' + i);
	        		missedChars += c1 + ", ";
	        		
	        	}
	        }
	        System.out.println("missedchar to make a panagram : " + missedChars);
	    }
	}
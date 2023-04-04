package string;

//Check if the given String is Palindrome or not
//Problem Statement: “Given a string, check if the string is palindrome or not.”  
//A string is said to be palindrome if the reverse of the string is the same as the string.

public class Q1_1 {
	static private boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			char l = s.charAt(left), r = s.charAt(right);
			if (!Character.isLetterOrDigit(l)) {
				left++;
			} else if (!Character.isLetterOrDigit(r)) {
				right++;
			} else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "ABCDCBA";
		boolean ans = isPalindrome(str);

		if (ans == true) {
			System.out.println(str + " is Palindrome");
		} else {
			System.out.println(str + " is not Palindrome");
		}
	}
}

//The Java Character isLetterOrDigit() method determines if the specified character is a letter or digit.
//
//Here, a character is considered to be a letter or digit if either Character.isLetter() method or Character.isDigit() method returns true for the said character.

/*
 * 
 * Example 1: Input: Str = “ABCDCBA” Output: Palindrome Explanation: String when
 * reversed is the same as string.
 * 
 * Example 2: Input: Str = “TAKE U FORWARD” Output: Not Palindrome Explanation:
 * String when reversed is not the same as string.
 * ========================================================
 * 
 * Approach:
 * 
 * Run a for loop till half the length of the string in order to check the first
 * and last character of the string.
 * 
 * And check if the first and last elements of the string are equal. And then
 * move both pointers first pointer forward and last pointer backward.
 * 
 * Here we are achieving this with the help of ‘i’ which moves with them for a
 * loop. First element can be get by str[i] and last element by str[str.length()
 * – i – 1]). If this condition gets executed then it is not palindrome and
 * returns false.
 * 
 * If the loop ends after traversing elements till half of the length then, it
 * is Palindrome and returns false.
 * 
 * ================================== Output: Palindrome
 * 
 * Time Complexity: O(N)
 * 
 * Space Complexity: O(1)
 * 
 */
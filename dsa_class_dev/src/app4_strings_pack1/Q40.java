package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q40 {
	public static void main(String[] args) {
		String src = "abcabcabcabc";
		String expression = "c";
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(src);
		
		while(matches.find())
		{
			System.out.println(matches.group() + ":" + matches.start());
			
		}
	}
}
// any part of the string is called as expression
// by using expression we can get the pattern
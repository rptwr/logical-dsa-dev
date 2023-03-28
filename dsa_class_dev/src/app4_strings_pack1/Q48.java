package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q48 {
	public static void main(String[] args) {
		String src = "a123b234c567e3045";
		System.out.println(src);
		String expression = "[\\d]";  // \d represents the digit in the regular expression 
//		String expression = "\\d";
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(src);
		
		while(matches.find())
		{
			System.out.println(matches.group() + ":" + matches.start());
			
		}
	}
}
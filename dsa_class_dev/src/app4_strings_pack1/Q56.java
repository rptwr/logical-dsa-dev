package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q56 {
	public static void main(String[] args) {
//		String src = "abs";
		String src = "1abs";
		System.out.println(src);
		String expression = "[a-z]$";   // $ is for any char checking 
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(src);
		
		while(matches.find())
		{
			System.out.println(matches.group() + ":" + matches.start());
			
		}
	}
}

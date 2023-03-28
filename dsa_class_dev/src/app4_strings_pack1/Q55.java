package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q55 {
	public static void main(String[] args) {
//		String src = "a1b2c3d4";
//		String src = "abc";
		String src = "1abs";
		System.out.println(src);
		String expression = "^[a-z]";   //^ checking starting character in the given string  
		Pattern pattern = Pattern.compile(expression);
		Matcher matches = pattern.matcher(src);
		System.out.println(matches.find());
	}
}

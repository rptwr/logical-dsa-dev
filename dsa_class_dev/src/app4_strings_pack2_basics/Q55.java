package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// find out occurance of abc

public class Q55 {
	public static void main(String[] args) {
//		String src = "abcabcabcabcabcabc"; // source  // in the source find out occurance of pression
		String src = "abcqsqsqsabcqswdabcdwdabcwdwdabcwdwdabc"; // source 
		String exp = "abc";  // expression
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}


// expression can be retrieved through search()
// source, expression, pattern, matcher
// pattern should be defined on top of expression
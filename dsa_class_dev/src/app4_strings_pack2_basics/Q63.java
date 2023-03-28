package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q63 {
	public static void main(String[] args) {
		String src = "abc hello 123 xyz"; // source  
//		String exp = "\\s";  // expression  // all the occurances of white space will be reading even white spaces printing // (\s)matches whitespace character
		String exp = "\\S";  // expression  // /S it gives opposite of smalls
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}

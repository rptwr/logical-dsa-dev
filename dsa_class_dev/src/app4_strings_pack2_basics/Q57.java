package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q57 {
	public static void main(String[] args) {
		String src = "hello123helloxyzhellopqrello"; // source  
//		String exp = "e";  // expression
		String exp = "[eo]";  // expression  // it will search for e and o occurances seprately  
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}

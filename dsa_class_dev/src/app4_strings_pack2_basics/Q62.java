package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q62 {
	public static void main(String[] args) {
		String src = "a1abc3xyz9test4hello6test"; // source  
		String exp = "\\D";  // expression  // \D represents other than digits // opposite of digits
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}

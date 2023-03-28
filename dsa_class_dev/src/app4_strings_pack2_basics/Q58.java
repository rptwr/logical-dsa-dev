package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q58 {
	public static void main(String[] args) {
		String src = "abcdekjfjbeuhbfjknsijaoidpwfejfb"; // source  
		String exp = "[a-k]";  // expression  // characters from a to k
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}

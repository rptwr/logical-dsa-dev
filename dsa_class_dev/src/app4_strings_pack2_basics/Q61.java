package app4_strings_pack2_basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q61 {
	public static void main(String[] args) {
		String src = "a1abc3xyz9test4hello6test"; // source  
		String exp = "\\d";  // expression  // internally it will take 1 backward slash and d
		Pattern pattern = Pattern.compile(exp);  // regex
		Matcher matcher = pattern.matcher(src);
		while(matcher.find()) {
			System.out.println(matcher.group() + ":" +  matcher.start());
		}
	}
}


// \d means if there is any digit but '\' is an escape sequence hence '\\' is used.
// (\d) used for representing digit
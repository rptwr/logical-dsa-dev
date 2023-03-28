package app4_strings_pack1;
  //Regular Expression
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q39 {
   public static void main(String[] args) {
	String src = "abcabcabcabc";
	String expression = "abc";
	Pattern pattern = Pattern.compile(expression);
	Matcher matches = pattern.matcher(src);
	
	while(matches.find())
	{
		System.out.println(matches.group() + ":" + matches.start());
		
	}
  }
}


//regex is called regular expression

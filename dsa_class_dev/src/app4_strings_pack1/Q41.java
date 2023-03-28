package app4_strings_pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q41 {
	public static void main(String[] args) {
		String src = "abc;abc;abc;abc;hello;123";
		System.out.println(src);
		String expression = ";";   // whichever portion you want to search
		Pattern pattern = Pattern.compile(expression);  // by using expression define the pattern
		Matcher matches = pattern.matcher(src);  // pattern whenever avl in src 
		while(matches.find())  //find the object   // no of iteration based on method use while loop
		{
			System.out.println(matches.group() + ":" + matches.start());  
			
		}
	}
}
